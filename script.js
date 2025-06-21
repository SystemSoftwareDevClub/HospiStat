function updateDashboard(data) {
    const latestDataMap = new Map();
  
    // Find the latest record for each patient
    data.forEach(entry => {
      if (
        !latestDataMap.has(entry.patient_id) ||
        latestDataMap.get(entry.patient_id).timestamp < entry.timestamp
      ) {
        latestDataMap.set(entry.patient_id, entry);
      }
    });
  
    // Update the DOM
    latestDataMap.forEach((patientData, patientId) => {
      const patientDiv = document.getElementById(patientId);
      if (patientDiv) {
        patientDiv.innerHTML = `
          <h3>${patientId}</h3>
          <p><strong>Heart Rate:</strong> ${patientData.heart_rate} bpm</p>
          <p><strong>Temperature:</strong> ${patientData.temperature} °F</p>
          <p><small>Last Updated: ${new Date(patientData.timestamp * 1000).toLocaleTimeString()}</small></p>
        `;
      }
    });
  }