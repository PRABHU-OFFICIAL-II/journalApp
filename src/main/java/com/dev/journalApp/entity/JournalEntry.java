package com.dev.journalApp.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

// @Document annotation will tell MongoDB to consider this as a ORM mapping from Spring to Mongo, so this will be considered as a Document(row) in the MongoDb
@Document(collection = "journal_entries")
@Data // It generates the @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode for all the objects
public class JournalEntry { // These are called POJO (Plain Old Java Object)

    // In a collection of Documents in the mongoDb, this @Id annotation will work as a Unique Identifier also called the Primary Key.
    @Id
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;

//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public ObjectId getId() {
//        return id;
//    }
//
//    public void setId(ObjectId id) {
//        this.id = id;
//    }
//
//    public LocalDateTime getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDateTime date) {
//        this.date = date;
//    }
}
