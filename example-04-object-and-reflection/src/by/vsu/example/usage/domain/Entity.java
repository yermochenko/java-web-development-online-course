package by.vsu.example.usage.domain;

import java.util.Objects;
import java.util.Optional;

public class Entity {
	private Integer id;

	public final Optional<Integer> getId() {
		return Optional.ofNullable(id);
	}

	public final void setId(Integer id) {
		this.id = id;
	}

//	@Override
//	public final boolean equals(Object obj) {
//		if(this == obj) return true;
//		if(!(obj instanceof Entity entity)) return false;
//		return Objects.equals(id, entity.id);
//	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Entity entity = (Entity) obj;
		return Objects.equals(id, entity.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}
}
