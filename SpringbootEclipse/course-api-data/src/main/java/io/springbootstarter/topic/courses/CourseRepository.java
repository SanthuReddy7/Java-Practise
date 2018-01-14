package io.springbootstarter.topic.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course,String>  {

	// getAllTopics()
		// getTopic(String id)
		// updateTopic(Topic t)
		// deleteTopic(String id)
	/*// All these are provided by spring data jpa
	// we need not want to write class we need to write interface
	
	//

	//spring data jpa framework comes with one repository call curdRepository
	//we need to extend the repository
*/	
	public List<Course> findByTopicId(String topicId);
	
}
