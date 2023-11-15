package ma.nainia.isic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.nainia.isic.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{

}
