package com.dev.journalApp.entity;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")
@Data
public class User {

    @Id
    private ObjectId id;

    @Indexed(unique = true) // To enable the Auto Indexing of the Fields in Mongo DB, we have to add this property -> JournalEntryControllerV2spring.data.mongodb.auto-index-creation=true in the Application Properties file
    @NonNull
    private String username;
    @NonNull
    private String password;

    @DBRef // Works as a Foreign key and creates Collections & Document references between multiple entities / classes
    private List<JournalEntry> journalEntries = new ArrayList<>();
}
