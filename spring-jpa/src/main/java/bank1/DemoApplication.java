package bank1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication{ //implements CommandLineRunner {

//	private final PostRepository postRepository;
//
//	public DemoApplication(PostRepository postRepository) {
//		this.postRepository = postRepository;
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Post post = new Post();
//		post.setTitle("post_1");
//		postRepository.save(post);
//	}
}
