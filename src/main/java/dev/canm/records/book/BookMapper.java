package dev.canm.records.book;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
interface BookMapper {

    Book toBookRecord(BookEntity bookEntity);

    BookEntity toBook(Book book);
}
