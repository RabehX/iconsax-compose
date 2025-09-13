/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.FlashCircle: ImageVector
    get() {
        if (_FlashCircle != null) {
            return _FlashCircle!!
        }
        _FlashCircle = ImageVector.Builder(
            name = "Filled.FlashCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(15.53f, 13.23f)
                lineTo(10.35f, 16.82f)
                curveTo(9.59f, 17.35f, 9.15f, 17.04f, 9.37f, 16.15f)
                lineTo(10.32f, 12.31f)
                lineTo(8.67f, 11.9f)
                curveTo(7.92f, 11.72f, 7.83f, 11.2f, 8.46f, 10.76f)
                lineTo(13.64f, 7.17f)
                curveTo(14.4f, 6.64f, 14.84f, 6.95f, 14.62f, 7.84f)
                lineTo(13.67f, 11.68f)
                lineTo(15.32f, 12.09f)
                curveTo(16.07f, 12.28f, 16.16f, 12.79f, 15.53f, 13.23f)
                close()
            }
        }.build()

        return _FlashCircle!!
    }

@Suppress("ObjectPropertyName")
private var _FlashCircle: ImageVector? = null
