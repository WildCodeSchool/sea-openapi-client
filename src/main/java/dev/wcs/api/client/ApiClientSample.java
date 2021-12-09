package dev.wcs.api.client;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.BookControllerApi;
import org.openapitools.client.model.Book;

import java.util.List;

public class ApiClientSample {

    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        BookControllerApi bookControllerApi = new BookControllerApi(apiClient);

        // Get all Books
        List<Book> books = bookControllerApi.indexUsingGET();
        System.out.println(books);

        // New Book to be created
        Book book = new Book();
        book.setAuthor("new author");
        book.setTitle("new title");
        book.setDescription("new descr");
        // Post/Create new Book
        bookControllerApi.createUsingPOST(book);

        // Get all Books again
        books = bookControllerApi.indexUsingGET();
        System.out.println(books);
    }
}
