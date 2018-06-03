package com.spring5webapp.boostrap;

import com.spring5webapp.model.Author;
import com.spring5webapp.model.Book;
import com.spring5webapp.model.Publisher;
import com.spring5webapp.repositories.BookRepository;
import com.spring5webapp.repositories.PublisherRepository;
import com.spring5webapp.repositories.AuthorRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

  private AuthorRepository authorRepository;
  private BookRepository bookRepository;
  private PublisherRepository publisherRepository;

  public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
                      PublisherRepository publisherRepository) {
    this.authorRepository = authorRepository;
    this.bookRepository = bookRepository;
    this.publisherRepository = publisherRepository;
  }

  @Override
  public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    initData();
  }

  private void initData() {
    //Eric
    Publisher publisher1 = new Publisher("Harper Collins", "USA");
    publisherRepository.save(publisher1);
    Author eric = new Author("Eric", "Evans");

    Book ddd = new Book("Domain Drive Design", "1234", publisher1);
    eric.getBooks().add(ddd);
    ddd.getAuthors().add(eric);

    authorRepository.save(eric);
    bookRepository.save(ddd);

    //Rod
    Publisher publisher2 = new Publisher("Worx", "USA");
    publisherRepository.save(publisher2);
    Author rod = new Author("Rod", "Johson");
    Book noEjB = new Book("J2EE Development without EJB", "2344", publisher2);
    rod.getBooks().add(noEjB);

    authorRepository.save(rod);
    bookRepository.save(noEjB);
  }
}
