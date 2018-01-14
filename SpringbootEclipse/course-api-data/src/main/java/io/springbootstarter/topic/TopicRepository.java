package io.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic,String>  {

	/*// All these are provided by spring data jpa
	// we need not want to write class we need to write interface
	// getAllTopics()
	// getTopic(String id)
	// updateTopic(Topic t)
	// deleteTopic(String id)
	//

	//spring data jpa framework comes with one repository call curdRepository
	//we need to extend the repository
*/	
	
}
