package com.chicken.galaxy.ui.main.upgrades

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.chicken.galaxy.ui.main.menuscreen.PlayerViewModel

@Composable
fun MagnetShopScreen(
    onBack: () -> Unit,
    playerVm: PlayerViewModel = hiltViewModel()
) {
    UpgradeScreen(onBack = onBack, playerVm = playerVm)
}
