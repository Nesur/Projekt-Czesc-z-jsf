package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Appointment;

@ApplicationScoped
public class AppointmentManager {
	private List<Appointment> db = new ArrayList<Appointment>();

	public void addAppointment(Appointment appointment) {
		Appointment newAppointment = new Appointment();

		newAppointment.setInstructor(appointment.getInstructor());
		newAppointment.setStudent(appointment.getStudent());
		newAppointment.setDate(appointment.getDate());
		newAppointment.setTime(appointment.getTime());

		db.add(newAppointment);
	}

	public void deleteAppointment(Appointment appointment) {
		Appointment appointmentToRemove = null;
		for (Appointment a : db) {
			if (appointment.getStudent().equalsIgnoreCase(a.getStudent())) {
				appointmentToRemove = a;
				break;
			}
		}
		if (appointmentToRemove != null)
			db.remove(appointmentToRemove);
	}

	public List<Appointment> getAllAppointment() {
		return db;
	}

}
