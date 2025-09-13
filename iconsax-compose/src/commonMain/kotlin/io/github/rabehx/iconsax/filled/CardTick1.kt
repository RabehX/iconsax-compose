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


val Iconsax.Filled.CardTick1: ImageVector
    get() {
        if (_CardTick1 != null) {
            return _CardTick1!!
        }
        _CardTick1 = ImageVector.Builder(
            name = "Filled.CardTick1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 11.46f)
                verticalLineTo(16.46f)
                curveTo(2f, 18.75f, 3.85f, 20.6f, 6.14f, 20.6f)
                horizontalLineTo(17.85f)
                curveTo(20.14f, 20.6f, 22f, 18.74f, 22f, 16.45f)
                verticalLineTo(11.46f)
                curveTo(22f, 10.79f, 21.46f, 10.25f, 20.79f, 10.25f)
                horizontalLineTo(3.21f)
                curveTo(2.54f, 10.25f, 2f, 10.79f, 2f, 11.46f)
                close()
                moveTo(8f, 17.25f)
                horizontalLineTo(6f)
                curveTo(5.59f, 17.25f, 5.25f, 16.91f, 5.25f, 16.5f)
                curveTo(5.25f, 16.09f, 5.59f, 15.75f, 6f, 15.75f)
                horizontalLineTo(8f)
                curveTo(8.41f, 15.75f, 8.75f, 16.09f, 8.75f, 16.5f)
                curveTo(8.75f, 16.91f, 8.41f, 17.25f, 8f, 17.25f)
                close()
                moveTo(14.5f, 17.25f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 17.25f, 9.75f, 16.91f, 9.75f, 16.5f)
                curveTo(9.75f, 16.09f, 10.09f, 15.75f, 10.5f, 15.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 15.75f, 15.25f, 16.09f, 15.25f, 16.5f)
                curveTo(15.25f, 16.91f, 14.91f, 17.25f, 14.5f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.5f, 4.608f)
                verticalLineTo(7.538f)
                curveTo(13.5f, 8.208f, 12.96f, 8.748f, 12.29f, 8.748f)
                horizontalLineTo(3.21f)
                curveTo(2.53f, 8.748f, 2f, 8.188f, 2f, 7.518f)
                curveTo(2.01f, 6.388f, 2.46f, 5.358f, 3.21f, 4.608f)
                curveTo(3.96f, 3.858f, 5f, 3.398f, 6.14f, 3.398f)
                horizontalLineTo(12.29f)
                curveTo(12.96f, 3.398f, 13.5f, 3.938f, 13.5f, 4.608f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.97f, 2f)
                horizontalLineTo(17.03f)
                curveTo(15.76f, 2f, 15f, 2.76f, 15f, 4.03f)
                verticalLineTo(6.97f)
                curveTo(15f, 8.24f, 15.76f, 9f, 17.03f, 9f)
                horizontalLineTo(19.97f)
                curveTo(21.24f, 9f, 22f, 8.24f, 22f, 6.97f)
                verticalLineTo(4.03f)
                curveTo(22f, 2.76f, 21.24f, 2f, 19.97f, 2f)
                close()
                moveTo(20.63f, 4.45f)
                lineTo(18.26f, 7.22f)
                curveTo(18.17f, 7.33f, 18.03f, 7.4f, 17.89f, 7.4f)
                curveTo(17.88f, 7.4f, 17.88f, 7.4f, 17.87f, 7.4f)
                curveTo(17.73f, 7.4f, 17.6f, 7.35f, 17.5f, 7.25f)
                lineTo(16.4f, 6.17f)
                curveTo(16.2f, 5.97f, 16.2f, 5.64f, 16.4f, 5.44f)
                curveTo(16.6f, 5.24f, 16.93f, 5.23f, 17.13f, 5.44f)
                lineTo(17.83f, 6.13f)
                lineTo(19.83f, 3.79f)
                curveTo(20.02f, 3.57f, 20.34f, 3.55f, 20.56f, 3.73f)
                curveTo(20.79f, 3.91f, 20.81f, 4.24f, 20.63f, 4.45f)
                close()
            }
        }.build()

        return _CardTick1!!
    }

@Suppress("ObjectPropertyName")
private var _CardTick1: ImageVector? = null
