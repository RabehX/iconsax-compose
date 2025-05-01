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


val Iconsax.Filled.Maximize2: ImageVector
    get() {
        if (_Maximize2 != null) {
            return _Maximize2!!
        }
        _Maximize2 = ImageVector.Builder(
            name = "Filled.Maximize2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(10.22f, 21f)
                horizontalLineTo(7.91f)
                curveTo(5.2f, 21f, 3f, 18.8f, 3f, 16.09f)
                verticalLineTo(13.78f)
                curveTo(3f, 13.37f, 3.34f, 13.03f, 3.75f, 13.03f)
                curveTo(4.16f, 13.03f, 4.5f, 13.37f, 4.5f, 13.78f)
                verticalLineTo(16.09f)
                curveTo(4.5f, 17.97f, 6.03f, 19.5f, 7.91f, 19.5f)
                horizontalLineTo(10.22f)
                curveTo(10.63f, 19.5f, 10.97f, 19.84f, 10.97f, 20.25f)
                curveTo(10.97f, 20.66f, 10.64f, 21f, 10.22f, 21f)
                close()
                moveTo(10.22f, 4.5f)
                horizontalLineTo(7.91f)
                curveTo(6.03f, 4.5f, 4.5f, 6.03f, 4.5f, 7.91f)
                verticalLineTo(10.22f)
                curveTo(4.5f, 10.63f, 4.16f, 10.97f, 3.75f, 10.97f)
                curveTo(3.34f, 10.97f, 3f, 10.64f, 3f, 10.22f)
                verticalLineTo(7.91f)
                curveTo(3f, 5.2f, 5.2f, 3f, 7.91f, 3f)
                horizontalLineTo(10.22f)
                curveTo(10.63f, 3f, 10.97f, 3.34f, 10.97f, 3.75f)
                curveTo(10.97f, 4.16f, 10.64f, 4.5f, 10.22f, 4.5f)
                close()
                moveTo(21f, 16.09f)
                curveTo(21f, 18.8f, 18.8f, 21f, 16.09f, 21f)
                horizontalLineTo(14.7f)
                curveTo(14.29f, 21f, 13.95f, 20.66f, 13.95f, 20.25f)
                curveTo(13.95f, 19.84f, 14.29f, 19.5f, 14.7f, 19.5f)
                horizontalLineTo(16.09f)
                curveTo(17.97f, 19.5f, 19.5f, 17.97f, 19.5f, 16.09f)
                verticalLineTo(14.7f)
                curveTo(19.5f, 14.29f, 19.84f, 13.95f, 20.25f, 13.95f)
                curveTo(20.66f, 13.95f, 21f, 14.29f, 21f, 14.7f)
                verticalLineTo(16.09f)
                close()
                moveTo(21f, 10.22f)
                curveTo(21f, 10.63f, 20.66f, 10.97f, 20.25f, 10.97f)
                curveTo(19.84f, 10.97f, 19.5f, 10.63f, 19.5f, 10.22f)
                verticalLineTo(7.91f)
                curveTo(19.5f, 6.03f, 17.97f, 4.5f, 16.09f, 4.5f)
                horizontalLineTo(13.78f)
                curveTo(13.37f, 4.5f, 13.03f, 4.16f, 13.03f, 3.75f)
                curveTo(13.03f, 3.34f, 13.36f, 3f, 13.78f, 3f)
                horizontalLineTo(16.09f)
                curveTo(18.8f, 3f, 21f, 5.2f, 21f, 7.91f)
                verticalLineTo(10.22f)
                close()
            }
        }.build()

        return _Maximize2!!
    }

@Suppress("ObjectPropertyName")
private var _Maximize2: ImageVector? = null
