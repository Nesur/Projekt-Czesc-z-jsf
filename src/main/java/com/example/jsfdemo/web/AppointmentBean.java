package com.example.jsfdemo.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Appointment;
import com.example.jsfdemo.service.AppointmentManager;

@SessionScoped
@Named("appointmentBean")
public class AppointmentBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Appointment appointment = new Appointment();

	private ListDataModel<Appointment> appointments = new ListDataModel<Appointment>();

	@Inject
	private AppointmentManager am;

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public ListDataModel<Appointment> getAllAppointments() {
		appointments.setWrappedData(am.getAllAppointment());
		return appointments;
	}

	public String addAppointment() {
		am.addAppointment(appointment);
		appointment = new Appointment();
		return "showAppointments";
	}

	public String deleteAppointment() {
		Appointment appointmentToDelete = appointments.getRowData();
		am.deleteAppointment(appointmentToDelete);
		return null;
	}

}
