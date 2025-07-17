package com.controleequipamento.mapper;

import com.controleequipamento.dto.FuncionarioDTO;
import com.controleequipamento.entity.Funcionario;

public class FuncionarioMapper {

	public static FuncionarioDTO toDTO(Funcionario funcionario) {
		if (funcionario == null) {
			return null;
		}

		FuncionarioDTO dto = new FuncionarioDTO();
		dto.setId(funcionario.getId());
		dto.setNome(funcionario.getNome());
		dto.setEmail(funcionario.getEmail());
		dto.setTelefone(funcionario.getTelefone());
		return dto;
	}

	public static Funcionario toEntity(FuncionarioDTO dto) {

		if (dto == null) {
			return null;
		}

		Funcionario funcionario = new Funcionario();
		funcionario.setId(dto.getId());
		funcionario.setNome(dto.getNome());
		funcionario.setEmail(dto.getEmail());
		funcionario.setTelefone(dto.getTelefone());
		return funcionario;
	}

}
