package ma.nainia.isic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.nainia.isic.IDao.IDao;
import ma.nainia.isic.entities.Categorie;
import ma.nainia.isic.repositories.CategorieRepository;

@Service
public class CategorieService implements IDao<Categorie> {
	
	@Autowired
	private CategorieRepository repository;

	@Override
	public Categorie create(Categorie o) {
		 return repository.save(o);
	}

	@Override
	public boolean delete(Categorie o) {
		try {
			repository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Categorie update(Categorie o) {
		return repository.save(o);
	}

	@Override
	public Categorie findById(long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Categorie> findAll() {
		return repository.findAll();
	}
	

}
