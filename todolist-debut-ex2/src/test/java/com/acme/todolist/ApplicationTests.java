package com.acme.todolist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.acme.todolist.domain.TodoItem;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
		// Créer un objet TodoItem avec une date	
					TodoItem item = new TodoItem("1", Instant.now().plus(1, ChronoUnit.DAYS), "Todo");
					// Insertion de la  note
					assertEquals("[LATE!]", item.finalContent());
	}

}
