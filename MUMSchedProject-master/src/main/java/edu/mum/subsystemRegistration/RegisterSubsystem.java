package edu.mum.subsystemRegistration;

import java.util.List;

import edu.mum.domain.Section;

public interface RegisterSubsystem {
	
	public List<Section> getListSection();
	public String register(Section section);
	
}
