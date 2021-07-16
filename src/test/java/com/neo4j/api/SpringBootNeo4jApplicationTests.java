package com.neo4j.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.neo4j.api.model.Membership;
import com.neo4j.api.model.Movie;
import com.neo4j.api.model.Negotiation;
import com.neo4j.api.model.Person;
import com.neo4j.api.model.Post;
import com.neo4j.api.model.WorkGroup;
import com.neo4j.api.model.WorkGroupComment;
import com.neo4j.api.service.MembershipService;
import com.neo4j.api.service.MovieService;
import com.neo4j.api.service.PersonService;
import com.neo4j.api.service.PostService;
import com.neo4j.api.service.WorkGroupCommentService;
import com.neo4j.api.service.WorkGroupService;

@SpringBootTest
class SpringBootNeo4jApplicationTests {
	@Autowired
	MovieService movieService;
	@Autowired
	PersonService personService;
	@Autowired
	WorkGroupService workGroupService;
	@Autowired
	MembershipService membershipService;
	@Autowired
	WorkGroupCommentService workGroupCommentService;
	@Autowired
	PostService postService;

	@Test
	void contextLoads() {
//		testMovie();
//		testWorkGroup();
//		testMembership();
//		testPost();
//		testWorkGroupComment();

	}

	// FOR MOVIE PERSON
	void testMovie() {
		Movie movie = new Movie();
		movie.setTitle("3idiots");
		movie.setDescription("nice movie");

		Set<Person> actors = new HashSet<Person>();
		Person actor1 = new Person();
		actor1.setName("Aslam Actor1");
		actor1.setAge("31");
		actors.add(actor1);

		Person actor2 = new Person();
		actor2.setName("Aslam Actor2");
		actor2.setAge("32");
		actors.add(actor2);

		movie.setActors(actors);

		Set<Person> directors = new HashSet<Person>();
		Person director1 = new Person();
		director1.setName("Aslam Director1");
		director1.setAge("31");
		directors.add(director1);

		Person director2 = new Person();
		director2.setName("Aslam Director2");
		director2.setAge("32");
		directors.add(director2);

		movie.setDirectors(directors);
		movieService.createMovie(movie);

//		movieService.deleteAll();
//		personService.deleteAll();
	}

	// FOR WORKGROUP
	void testWorkGroup() {

		WorkGroup workGroup = new WorkGroup();
		workGroup.setName("Enkaizen");

		Membership owner = new Membership();
		owner.setName("Aslam");

		workGroup.setOwner(owner);

		List<Membership> memberships = new ArrayList<>();
		Membership membership1 = new Membership();
		membership1.setName("Azad");
		Membership membership2 = new Membership();
		membership2.setName("Akram");
		memberships.add(membership1);
		memberships.add(membership2);
		workGroup.setMembers(memberships);

		List<Negotiation> negotiations = new ArrayList<>();
		Negotiation negotiation1 = new Negotiation();
		negotiation1.setTitle("negotiation1");
		negotiation1.setDescription("negotiation1");
		Negotiation negotiation2 = new Negotiation();
		negotiation2.setTitle("negotiation2");
		negotiation2.setDescription("negotiation2");
		negotiations.add(negotiation1);
		negotiations.add(negotiation2);
		workGroup.setNegotiations(negotiations);

		workGroupService.createWorkGroup(workGroup);
	}

	// FOR MEMBERSHP
	void testMembership() {

		Membership membership = new Membership();
		membership.setName("Kalam");
		membershipService.createMembership(membership);
	}

	void testPost() {
		// FOR POST
		Post post = new Post();
		post.setTitle("Post1");
		post.setDescription("Eid Post");
		postService.createPost(post);
	}

	// FOR WORKGROUP COMMENT
	void testWorkGroupComment() {

		WorkGroupComment workGroupComment = new WorkGroupComment();
		workGroupComment.setMessage("Eid vacation");
		workGroupCommentService.createWorkGroupComment(workGroupComment);
	}
}
