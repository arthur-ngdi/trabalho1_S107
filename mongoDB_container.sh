#!/bin/bash

# Atualizar o sistema
sudo apt update -y

# Instalar o Docker
sudo apt install docker.io -y

# Iniciar o serviço Docker
sudo systemctl start docker

# Baixar a imagem do MongoDB
sudo docker pull mongo:latest

# Executar o container MongoDB
docker run -d -p 27017:27017 mongo:latest

use SoilCheck