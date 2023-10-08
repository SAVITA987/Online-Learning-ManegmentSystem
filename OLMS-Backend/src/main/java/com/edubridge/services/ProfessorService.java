package com.edubridge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edubridge.model.Professor;
import com.edubridge.repository.ProfessorRepository;

@Service
public class ProfessorService 
{
	@Autowired
	private ProfessorRepository professorRepo;
	
	public Professor saveProfessor(Professor professor)
	{
		return professorRepo.save(professor);
	}
	
	public Professor addNewProfessor(Professor professor)
	{
		return professorRepo.save(professor);
	}
	
	public Professor updateProfessorProfile(Professor professor)
	{
		return professorRepo.save(professor);
	}
	
	public List<Professor> getAllProfessors()
	{
		return (List<Professor>)professorRepo.findAll();
	}
	
	public List<Professor> getProfessorListByEmail(String email) 
	{
		return (List<Professor>)professorRepo.findProfessorListByEmail(email);
	}
	public Professor getProfessorById(String professorid) 
	{
		return professorRepo.findByProfessorid(professorid);
	}
	
	public Professor fetchProfessorByEmail(String email)
	{
		return professorRepo.findByEmail(email);
	}
	
	public Professor fetchProfessorByProfessorname(String professorname)
	{
		return professorRepo.findByProfessorname(professorname);
	}
	
	public Professor fetchProfessorByEmailAndPassword(String email, String password)
	{
		return professorRepo.findByEmailAndPassword(email, password);
	}
	
	public List<Professor> fetchProfileByEmail(String email)
	{
		return (List<Professor>)professorRepo.findProfileByEmail(email);
	}

	public void updateStatus(String email) 
	{
		professorRepo.updateStatus(email);
	}

	public void rejectStatus(String email) 
	{
		professorRepo.rejectStatus(email);
	}

	public List<Professor> getProfessorsByEmail(String email)
	{
		return professorRepo.findProfessorListByEmail(email);
	}


	public List<Professor> deleteProfessorById(String professorid) {
		Professor professor = professorRepo.findByProfessorid(professorid);
		professorRepo.delete(professor);
		return (List<Professor>) professorRepo.findAll();
	}


}