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


val Iconsax.Filled.Building4: ImageVector
    get() {
        if (_Building4 != null) {
            return _Building4!!
        }
        _Building4 = ImageVector.Builder(
            name = "Filled.Building4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.32f, 3f)
                horizontalLineTo(5.09f)
                curveTo(3.1f, 3f, 2.1f, 4.01f, 2.1f, 6.02f)
                verticalLineTo(22f)
                horizontalLineTo(7.5f)
                verticalLineTo(18.25f)
                curveTo(7.5f, 17.84f, 7.84f, 17.5f, 8.25f, 17.5f)
                curveTo(8.66f, 17.5f, 9f, 17.83f, 9f, 18.25f)
                verticalLineTo(22f)
                horizontalLineTo(14.3f)
                verticalLineTo(6.02f)
                curveTo(14.3f, 4.01f, 13.31f, 3f, 11.32f, 3f)
                close()
                moveTo(10.75f, 12.75f)
                horizontalLineTo(5.8f)
                curveTo(5.39f, 12.75f, 5.05f, 12.41f, 5.05f, 12f)
                curveTo(5.05f, 11.59f, 5.39f, 11.25f, 5.8f, 11.25f)
                horizontalLineTo(10.75f)
                curveTo(11.16f, 11.25f, 11.5f, 11.59f, 11.5f, 12f)
                curveTo(11.5f, 12.41f, 11.16f, 12.75f, 10.75f, 12.75f)
                close()
                moveTo(10.75f, 9f)
                horizontalLineTo(5.8f)
                curveTo(5.39f, 9f, 5.05f, 8.66f, 5.05f, 8.25f)
                curveTo(5.05f, 7.84f, 5.39f, 7.5f, 5.8f, 7.5f)
                horizontalLineTo(10.75f)
                curveTo(11.16f, 7.5f, 11.5f, 7.84f, 11.5f, 8.25f)
                curveTo(11.5f, 8.66f, 11.16f, 9f, 10.75f, 9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(23f, 21.251f)
                horizontalLineTo(20.73f)
                verticalLineTo(18.251f)
                curveTo(21.68f, 17.941f, 22.37f, 17.051f, 22.37f, 16.001f)
                verticalLineTo(14.001f)
                curveTo(22.37f, 12.691f, 21.3f, 11.621f, 19.99f, 11.621f)
                curveTo(18.68f, 11.621f, 17.61f, 12.691f, 17.61f, 14.001f)
                verticalLineTo(16.001f)
                curveTo(17.61f, 17.041f, 18.29f, 17.921f, 19.22f, 18.241f)
                verticalLineTo(21.251f)
                horizontalLineTo(1f)
                curveTo(0.59f, 21.251f, 0.25f, 21.591f, 0.25f, 22.001f)
                curveTo(0.25f, 22.411f, 0.59f, 22.751f, 1f, 22.751f)
                horizontalLineTo(19.93f)
                curveTo(19.95f, 22.751f, 19.96f, 22.761f, 19.98f, 22.761f)
                curveTo(20f, 22.761f, 20.01f, 22.751f, 20.03f, 22.751f)
                horizontalLineTo(23f)
                curveTo(23.41f, 22.751f, 23.75f, 22.411f, 23.75f, 22.001f)
                curveTo(23.75f, 21.591f, 23.41f, 21.251f, 23f, 21.251f)
                close()
            }
        }.build()

        return _Building4!!
    }

@Suppress("ObjectPropertyName")
private var _Building4: ImageVector? = null
