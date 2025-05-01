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


val Iconsax.Filled.Routing2: ImageVector
    get() {
        if (_Routing2 != null) {
            return _Routing2!!
        }
        _Routing2 = ImageVector.Builder(
            name = "Filled.Routing2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.998f, 19.75f)
                horizontalLineTo(9.318f)
                curveTo(8.158f, 19.75f, 7.148f, 19.05f, 6.747f, 17.97f)
                curveTo(6.338f, 16.89f, 6.637f, 15.7f, 7.508f, 14.93f)
                lineTo(15.498f, 7.94f)
                curveTo(15.977f, 7.52f, 15.988f, 6.95f, 15.847f, 6.56f)
                curveTo(15.698f, 6.17f, 15.318f, 5.75f, 14.677f, 5.75f)
                horizontalLineTo(11.998f)
                curveTo(11.587f, 5.75f, 11.248f, 5.41f, 11.248f, 5f)
                curveTo(11.248f, 4.59f, 11.587f, 4.25f, 11.998f, 4.25f)
                horizontalLineTo(14.677f)
                curveTo(15.837f, 4.25f, 16.847f, 4.95f, 17.247f, 6.03f)
                curveTo(17.657f, 7.11f, 17.358f, 8.3f, 16.487f, 9.07f)
                lineTo(8.498f, 16.06f)
                curveTo(8.017f, 16.48f, 8.007f, 17.05f, 8.148f, 17.44f)
                curveTo(8.297f, 17.83f, 8.677f, 18.25f, 9.318f, 18.25f)
                horizontalLineTo(11.998f)
                curveTo(12.408f, 18.25f, 12.748f, 18.59f, 12.748f, 19f)
                curveTo(12.748f, 19.41f, 12.408f, 19.75f, 11.998f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 15f)
                horizontalLineTo(17f)
                curveTo(15.9f, 15f, 15f, 15.9f, 15f, 17f)
                verticalLineTo(20f)
                curveTo(15f, 21.1f, 15.9f, 22f, 17f, 22f)
                horizontalLineTo(20f)
                curveTo(21.1f, 22f, 22f, 21.1f, 22f, 20f)
                verticalLineTo(17f)
                curveTo(22f, 15.9f, 21.1f, 15f, 20f, 15f)
                close()
                moveTo(18.51f, 19.5f)
                curveTo(17.96f, 19.5f, 17.51f, 19.05f, 17.51f, 18.5f)
                curveTo(17.51f, 17.95f, 17.95f, 17.5f, 18.51f, 17.5f)
                horizontalLineTo(18.52f)
                curveTo(19.07f, 17.5f, 19.52f, 17.95f, 19.52f, 18.5f)
                curveTo(19.52f, 19.05f, 19.07f, 19.5f, 18.51f, 19.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.469f, 2f)
                curveTo(3.539f, 2f, 1.969f, 3.57f, 1.969f, 5.5f)
                curveTo(1.969f, 7.43f, 3.539f, 9f, 5.469f, 9f)
                curveTo(7.399f, 9f, 8.969f, 7.43f, 8.969f, 5.5f)
                curveTo(8.969f, 3.57f, 7.409f, 2f, 5.469f, 2f)
                close()
                moveTo(5.509f, 6.5f)
                curveTo(4.959f, 6.5f, 4.509f, 6.05f, 4.509f, 5.5f)
                curveTo(4.509f, 4.95f, 4.949f, 4.5f, 5.509f, 4.5f)
                horizontalLineTo(5.519f)
                curveTo(6.069f, 4.5f, 6.519f, 4.95f, 6.519f, 5.5f)
                curveTo(6.519f, 6.05f, 6.069f, 6.5f, 5.509f, 6.5f)
                close()
            }
        }.build()

        return _Routing2!!
    }

@Suppress("ObjectPropertyName")
private var _Routing2: ImageVector? = null
