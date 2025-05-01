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


val Iconsax.Filled.Redo: ImageVector
    get() {
        if (_Redo != null) {
            return _Redo!!
        }
        _Redo = ImageVector.Builder(
            name = "Filled.Redo",
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
                moveTo(17.53f, 10.22f)
                lineTo(15.96f, 11.79f)
                curveTo(15.81f, 11.94f, 15.62f, 12.01f, 15.43f, 12.01f)
                curveTo(15.24f, 12.01f, 15.05f, 11.94f, 14.9f, 11.79f)
                curveTo(14.61f, 11.5f, 14.61f, 11.02f, 14.9f, 10.73f)
                lineTo(15.16f, 10.47f)
                horizontalLineTo(10.08f)
                curveTo(8.8f, 10.47f, 7.75f, 11.51f, 7.75f, 12.8f)
                curveTo(7.75f, 14.09f, 8.79f, 15.13f, 10.08f, 15.13f)
                horizontalLineTo(15f)
                curveTo(15.41f, 15.13f, 15.75f, 15.47f, 15.75f, 15.88f)
                curveTo(15.75f, 16.29f, 15.41f, 16.63f, 15f, 16.63f)
                horizontalLineTo(10.08f)
                curveTo(7.97f, 16.63f, 6.25f, 14.91f, 6.25f, 12.8f)
                curveTo(6.25f, 10.69f, 7.97f, 8.97f, 10.08f, 8.97f)
                horizontalLineTo(15.23f)
                lineTo(14.9f, 8.65f)
                curveTo(14.61f, 8.36f, 14.61f, 7.88f, 14.9f, 7.59f)
                curveTo(15.19f, 7.3f, 15.67f, 7.3f, 15.96f, 7.59f)
                lineTo(17.53f, 9.16f)
                curveTo(17.82f, 9.46f, 17.82f, 9.93f, 17.53f, 10.22f)
                close()
            }
        }.build()

        return _Redo!!
    }

@Suppress("ObjectPropertyName")
private var _Redo: ImageVector? = null
