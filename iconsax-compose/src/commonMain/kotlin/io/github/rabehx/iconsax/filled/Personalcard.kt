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


val Iconsax.Filled.Personalcard: ImageVector
    get() {
        if (_Personalcard != null) {
            return _Personalcard!!
        }
        _Personalcard = ImageVector.Builder(
            name = "Filled.Personalcard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 3f)
                horizontalLineTo(6f)
                curveTo(3.79f, 3f, 2f, 4.78f, 2f, 6.97f)
                verticalLineTo(17.03f)
                curveTo(2f, 19.22f, 3.79f, 21f, 6f, 21f)
                horizontalLineTo(18f)
                curveTo(20.21f, 21f, 22f, 19.22f, 22f, 17.03f)
                verticalLineTo(6.97f)
                curveTo(22f, 4.78f, 20.21f, 3f, 18f, 3f)
                close()
                moveTo(8.5f, 7.17f)
                curveTo(9.77f, 7.17f, 10.81f, 8.21f, 10.81f, 9.48f)
                curveTo(10.81f, 10.75f, 9.77f, 11.79f, 8.5f, 11.79f)
                curveTo(7.23f, 11.79f, 6.19f, 10.75f, 6.19f, 9.48f)
                curveTo(6.19f, 8.21f, 7.23f, 7.17f, 8.5f, 7.17f)
                close()
                moveTo(12.37f, 16.66f)
                curveTo(12.28f, 16.76f, 12.14f, 16.82f, 12f, 16.82f)
                horizontalLineTo(5f)
                curveTo(4.86f, 16.82f, 4.72f, 16.76f, 4.63f, 16.66f)
                curveTo(4.54f, 16.56f, 4.49f, 16.42f, 4.5f, 16.28f)
                curveTo(4.67f, 14.6f, 6.01f, 13.27f, 7.69f, 13.11f)
                curveTo(8.22f, 13.06f, 8.77f, 13.06f, 9.3f, 13.11f)
                curveTo(10.98f, 13.27f, 12.33f, 14.6f, 12.49f, 16.28f)
                curveTo(12.51f, 16.42f, 12.46f, 16.56f, 12.37f, 16.66f)
                close()
                moveTo(19f, 16.75f)
                horizontalLineTo(17f)
                curveTo(16.59f, 16.75f, 16.25f, 16.41f, 16.25f, 16f)
                curveTo(16.25f, 15.59f, 16.59f, 15.25f, 17f, 15.25f)
                horizontalLineTo(19f)
                curveTo(19.41f, 15.25f, 19.75f, 15.59f, 19.75f, 16f)
                curveTo(19.75f, 16.41f, 19.41f, 16.75f, 19f, 16.75f)
                close()
                moveTo(19f, 12.75f)
                horizontalLineTo(15f)
                curveTo(14.59f, 12.75f, 14.25f, 12.41f, 14.25f, 12f)
                curveTo(14.25f, 11.59f, 14.59f, 11.25f, 15f, 11.25f)
                horizontalLineTo(19f)
                curveTo(19.41f, 11.25f, 19.75f, 11.59f, 19.75f, 12f)
                curveTo(19.75f, 12.41f, 19.41f, 12.75f, 19f, 12.75f)
                close()
                moveTo(19f, 8.75f)
                horizontalLineTo(14f)
                curveTo(13.59f, 8.75f, 13.25f, 8.41f, 13.25f, 8f)
                curveTo(13.25f, 7.59f, 13.59f, 7.25f, 14f, 7.25f)
                horizontalLineTo(19f)
                curveTo(19.41f, 7.25f, 19.75f, 7.59f, 19.75f, 8f)
                curveTo(19.75f, 8.41f, 19.41f, 8.75f, 19f, 8.75f)
                close()
            }
        }.build()

        return _Personalcard!!
    }

@Suppress("ObjectPropertyName")
private var _Personalcard: ImageVector? = null
