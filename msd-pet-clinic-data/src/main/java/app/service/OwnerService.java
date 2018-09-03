package app.service;

import app.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	Owner findByLastname  (String lastName);
}
