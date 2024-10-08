package com.example.instaclone_9room.domain.storyEntitiy;

import com.example.instaclone_9room.domain.userEntity.UserEntity;

import com.example.instaclone_9room.domain.baseEntity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StoryLikes extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "storyLikes_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "story_id")
    private Story story;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_entity_id")
    private UserEntity userEntity;
}
