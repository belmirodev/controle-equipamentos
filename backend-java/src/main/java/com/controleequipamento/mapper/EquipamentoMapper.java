package com.controleequipamento.mapper;

import com.controleequipamento.dto.EquipamentoDTO;
import com.controleequipamento.entity.Equipamento;

public class EquipamentoMapper {

	public static EquipamentoDTO toDTO(Equipamento equipamento) {

		if (equipamento == null) {
			return null;

		}

		EquipamentoDTO equipamentoDTO = new EquipamentoDTO();
		equipamentoDTO.setId(equipamento.getId());
		equipamentoDTO.setMarca(equipamento.getMarca());
		equipamentoDTO.setModelo(equipamento.getModelo());
		equipamentoDTO.setSerial(equipamento.getSerial());
		equipamentoDTO.setStatus(equipamento.getStatus());
		return equipamentoDTO;

	}
}
