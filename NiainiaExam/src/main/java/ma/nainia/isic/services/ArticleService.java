package ma.nainia.isic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.nainia.isic.IDao.IDao;
import ma.nainia.isic.entities.Article;
import ma.nainia.isic.repositories.ArticleRepository;

@Service
public class ArticleService implements IDao<Article>{

	@Autowired
	private ArticleRepository repository;
	
	@Override
	public Article create(Article o) {
		 return repository.save(o);
	}

	@Override
	public boolean delete(Article o) {
		try {
			repository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Article update(Article o) {
		return repository.save(o);
	}

	@Override
	public Article findById(long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Article> findAll() {
		return repository.findAll();
	}

}
