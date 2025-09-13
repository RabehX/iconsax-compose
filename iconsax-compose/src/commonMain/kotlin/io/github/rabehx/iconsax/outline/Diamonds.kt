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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Diamonds: ImageVector
    get() {
        if (_Diamonds != null) {
            return _Diamonds!!
        }
        _Diamonds = ImageVector.Builder(
            name = "Outline.Diamonds",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 22.6f)
                curveTo(10.891f, 22.6f, 9.861f, 22.13f, 9.091f, 21.29f)
                lineTo(2.231f, 13.75f)
                curveTo(1.261f, 12.69f, 0.961f, 10.82f, 1.541f, 9.51f)
                lineTo(4.101f, 3.75f)
                curveTo(4.801f, 2.18f, 5.971f, 1.41f, 7.691f, 1.41f)
                horizontalLineTo(16.281f)
                verticalLineTo(2.16f)
                verticalLineTo(1.41f)
                curveTo(18.001f, 1.41f, 19.171f, 2.17f, 19.871f, 3.74f)
                lineTo(22.431f, 9.5f)
                curveTo(23.011f, 10.81f, 22.721f, 12.68f, 21.751f, 13.74f)
                lineTo(14.901f, 21.29f)
                curveTo(14.151f, 22.13f, 13.111f, 22.6f, 12.001f, 22.6f)
                close()
                moveTo(16.291f, 2.9f)
                horizontalLineTo(7.701f)
                curveTo(6.391f, 2.9f, 5.861f, 3.48f, 5.481f, 4.35f)
                lineTo(2.921f, 10.11f)
                curveTo(2.581f, 10.88f, 2.781f, 12.11f, 3.341f, 12.73f)
                lineTo(10.201f, 20.27f)
                curveTo(10.681f, 20.8f, 11.321f, 21.09f, 12.001f, 21.09f)
                curveTo(12.681f, 21.09f, 13.321f, 20.8f, 13.801f, 20.27f)
                lineTo(20.651f, 12.72f)
                curveTo(21.221f, 12.09f, 21.421f, 10.87f, 21.071f, 10.1f)
                lineTo(18.511f, 4.34f)
                curveTo(18.131f, 3.48f, 17.601f, 2.9f, 16.291f, 2.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.5f, 8.75f)
                curveTo(3.09f, 8.75f, 2.75f, 8.41f, 2.75f, 8f)
                curveTo(2.75f, 7.59f, 3.09f, 7.25f, 3.5f, 7.25f)
                lineTo(20.5f, 7.24f)
                curveTo(20.91f, 7.24f, 21.25f, 7.58f, 21.25f, 7.99f)
                curveTo(21.25f, 8.4f, 20.91f, 8.74f, 20.5f, 8.74f)
                lineTo(3.5f, 8.75f)
                close()
            }
        }.build()

        return _Diamonds!!
    }

@Suppress("ObjectPropertyName")
private var _Diamonds: ImageVector? = null
