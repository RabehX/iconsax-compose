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


val Iconsax.Filled.Received: ImageVector
    get() {
        if (_Received != null) {
            return _Received!!
        }
        _Received = ImageVector.Builder(
            name = "Filled.Received",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.71f, 18.191f)
                curveTo(4.81f, 18.231f, 4.9f, 18.251f, 5f, 18.251f)
                horizontalLineTo(15.27f)
                curveTo(15.68f, 18.251f, 16.02f, 17.911f, 16.02f, 17.501f)
                curveTo(16.02f, 17.091f, 15.68f, 16.751f, 15.27f, 16.751f)
                horizontalLineTo(6.81f)
                lineTo(19.53f, 4.031f)
                curveTo(19.82f, 3.741f, 19.82f, 3.261f, 19.53f, 2.971f)
                curveTo(19.24f, 2.681f, 18.76f, 2.681f, 18.47f, 2.971f)
                lineTo(5.75f, 15.691f)
                verticalLineTo(7.231f)
                curveTo(5.75f, 6.821f, 5.41f, 6.481f, 5f, 6.481f)
                curveTo(4.59f, 6.481f, 4.25f, 6.821f, 4.25f, 7.231f)
                verticalLineTo(17.501f)
                curveTo(4.25f, 17.601f, 4.27f, 17.691f, 4.31f, 17.791f)
                curveTo(4.38f, 17.971f, 4.53f, 18.121f, 4.71f, 18.191f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 21.25f)
                horizontalLineTo(3.5f)
                curveTo(3.09f, 21.25f, 2.75f, 21.59f, 2.75f, 22f)
                curveTo(2.75f, 22.41f, 3.09f, 22.75f, 3.5f, 22.75f)
                horizontalLineTo(20.5f)
                curveTo(20.91f, 22.75f, 21.25f, 22.41f, 21.25f, 22f)
                curveTo(21.25f, 21.59f, 20.91f, 21.25f, 20.5f, 21.25f)
                close()
            }
        }.build()

        return _Received!!
    }

@Suppress("ObjectPropertyName")
private var _Received: ImageVector? = null
