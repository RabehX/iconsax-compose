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


val Iconsax.Filled.Building3: ImageVector
    get() {
        if (_Building3 != null) {
            return _Building3!!
        }
        _Building3 = ImageVector.Builder(
            name = "Filled.Building3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 7.07f)
                curveTo(15f, 6.4f, 14.67f, 5.78f, 14.11f, 5.41f)
                lineTo(10.11f, 2.74f)
                curveTo(9.44f, 2.29f, 8.56f, 2.29f, 7.89f, 2.74f)
                lineTo(3.89f, 5.41f)
                curveTo(3.34f, 5.78f, 3f, 6.4f, 3f, 7.07f)
                verticalLineTo(12.75f)
                curveTo(3f, 13.03f, 3.22f, 13.25f, 3.5f, 13.25f)
                horizontalLineTo(14.5f)
                curveTo(14.78f, 13.25f, 15f, 13.03f, 15f, 12.75f)
                verticalLineTo(7.07f)
                close()
                moveTo(9f, 10.75f)
                curveTo(8.04f, 10.75f, 7.25f, 9.96f, 7.25f, 9f)
                curveTo(7.25f, 8.04f, 8.04f, 7.25f, 9f, 7.25f)
                curveTo(9.96f, 7.25f, 10.75f, 8.04f, 10.75f, 9f)
                curveTo(10.75f, 9.96f, 9.96f, 10.75f, 9f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 21.251f)
                horizontalLineTo(20.73f)
                verticalLineTo(18.251f)
                curveTo(21.68f, 17.941f, 22.37f, 17.051f, 22.37f, 16.001f)
                verticalLineTo(14.001f)
                curveTo(22.37f, 12.691f, 21.3f, 11.621f, 19.99f, 11.621f)
                curveTo(18.68f, 11.621f, 17.61f, 12.691f, 17.61f, 14.001f)
                verticalLineTo(16.001f)
                curveTo(17.61f, 17.041f, 18.29f, 17.921f, 19.22f, 18.241f)
                verticalLineTo(21.251f)
                horizontalLineTo(15f)
                verticalLineTo(15.251f)
                curveTo(15f, 14.971f, 14.78f, 14.751f, 14.5f, 14.751f)
                horizontalLineTo(3.5f)
                curveTo(3.22f, 14.751f, 3f, 14.971f, 3f, 15.251f)
                verticalLineTo(21.251f)
                horizontalLineTo(2f)
                curveTo(1.59f, 21.251f, 1.25f, 21.591f, 1.25f, 22.001f)
                curveTo(1.25f, 22.411f, 1.59f, 22.751f, 2f, 22.751f)
                horizontalLineTo(19.93f)
                curveTo(19.95f, 22.751f, 19.96f, 22.761f, 19.98f, 22.761f)
                curveTo(20f, 22.761f, 20.01f, 22.751f, 20.03f, 22.751f)
                horizontalLineTo(22f)
                curveTo(22.41f, 22.751f, 22.75f, 22.411f, 22.75f, 22.001f)
                curveTo(22.75f, 21.591f, 22.41f, 21.251f, 22f, 21.251f)
                close()
                moveTo(8.25f, 18.251f)
                curveTo(8.25f, 17.841f, 8.59f, 17.501f, 9f, 17.501f)
                curveTo(9.41f, 17.501f, 9.75f, 17.841f, 9.75f, 18.251f)
                verticalLineTo(21.251f)
                horizontalLineTo(8.25f)
                verticalLineTo(18.251f)
                close()
            }
        }.build()

        return _Building3!!
    }

@Suppress("ObjectPropertyName")
private var _Building3: ImageVector? = null
