import time
import random
import json

class MecaGenialCore:
    def __init__(self, unit_id):
        self.unit_id = unit_id
        self.cloud_connection = "Google Cloud Connected"
        print(f"--- Meca Genial Core Initialized: Unit {self.unit_id} ---")

    def read_industrial_sensor(self):
        # Simula a leitura de sensores de uma máquina real na FATEC
        # Vibracao em mm/s e Temperatura em Celsius
        data = {
            "timestamp": time.time(),
            "vibration": round(random.uniform(0.5, 5.0), 2),
            "temperature": round(random.uniform(40.0, 85.0), 1),
            "unit": self.unit_id
        }
        return data

    def process_data(self, data):
        # Lógica de Soberania Digital: Processamento Local (Edge)
        print(f"[LOCAL EDGE] Processing data: Temp {data['temperature']}C")
        
        # Alerta se a vibração estiver alta (Manutenção Preditiva)
        if data['vibration'] > 4.0:
            print("⚠️ ALERT: High Vibration Detected! Potential failure in bearing.")
            self.send_to_simulation_cloud(data)
        else:
            print("✅ Status: Normal Operational Parameters.")

    def send_to_simulation_cloud(self, data):
        # Aqui entra a parceria multinacional para Simulações Pesadas / Digital Twin
        print(f"[GLOBAL CLOUD] Sending to Simulation Engine via {self.cloud_connection}...")
        # Simula o envio de um JSON para a API do Google Cloud Vertex AI
        payload = json.dumps(data)
        print(f"   Payload Sent: {payload}")

# --- EXECUÇÃO DO PROTÓTIPO ---
if __name__ == "__main__":
    # Instanciando a unidade de Itaquera
    meca_system = MecaGenialCore(unit_id="BR-SP-ITAQUERA-001")

    try:
        while True:
            sensor_data = meca_system.read_industrial_sensor()
            meca_system.process_data(sensor_data)
            print("-" * 50)
            time.sleep(3) # Aguarda 3 segundos para a próxima leitura
    except KeyboardInterrupt:
        print("\nSystem Paused. Meca Genial Core Standby.")
