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


val Iconsax.Filled.Buildings2: ImageVector
    get() {
        if (_Buildings2 != null) {
            return _Buildings2!!
        }
        _Buildings2 = ImageVector.Builder(
            name = "Filled.Buildings2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.6f, 4.15f)
                curveTo(10.6f, 4.34f, 10.44f, 4.5f, 10.25f, 4.5f)
                horizontalLineTo(9.12f)
                curveTo(6.96f, 4.5f, 5.2f, 6.26f, 5.2f, 8.42f)
                verticalLineTo(17.65f)
                curveTo(5.2f, 17.84f, 5.04f, 18f, 4.85f, 18f)
                horizontalLineTo(4.15f)
                curveTo(2.96f, 18f, 2f, 17.04f, 2f, 15.85f)
                verticalLineTo(4.15f)
                curveTo(2f, 2.96f, 2.96f, 2f, 4.15f, 2f)
                horizontalLineTo(8.45f)
                curveTo(9.64f, 2f, 10.6f, 2.96f, 10.6f, 4.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 4.15f)
                verticalLineTo(15.85f)
                curveTo(22f, 17.04f, 21.04f, 18f, 19.85f, 18f)
                horizontalLineTo(19.22f)
                curveTo(19.03f, 18f, 18.87f, 17.84f, 18.87f, 17.65f)
                verticalLineTo(8.42f)
                curveTo(18.87f, 6.26f, 17.11f, 4.5f, 14.95f, 4.5f)
                horizontalLineTo(13.75f)
                curveTo(13.56f, 4.5f, 13.4f, 4.34f, 13.4f, 4.15f)
                curveTo(13.4f, 2.96f, 14.36f, 2f, 15.55f, 2f)
                horizontalLineTo(19.85f)
                curveTo(21.04f, 2f, 22f, 2.96f, 22f, 4.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.949f, 6f)
                horizontalLineTo(9.119f)
                curveTo(7.779f, 6f, 6.699f, 7.08f, 6.699f, 8.42f)
                verticalLineTo(19.58f)
                curveTo(6.699f, 20.92f, 7.779f, 22f, 9.119f, 22f)
                horizontalLineTo(10.749f)
                curveTo(11.029f, 22f, 11.249f, 21.78f, 11.249f, 21.5f)
                verticalLineTo(19f)
                curveTo(11.249f, 18.59f, 11.589f, 18.25f, 11.999f, 18.25f)
                curveTo(12.409f, 18.25f, 12.749f, 18.59f, 12.749f, 19f)
                verticalLineTo(21.5f)
                curveTo(12.749f, 21.78f, 12.969f, 22f, 13.249f, 22f)
                horizontalLineTo(14.959f)
                curveTo(16.289f, 22f, 17.369f, 20.92f, 17.369f, 19.59f)
                verticalLineTo(8.42f)
                curveTo(17.369f, 7.08f, 16.289f, 6f, 14.949f, 6f)
                close()
                moveTo(13.999f, 14.75f)
                horizontalLineTo(9.999f)
                curveTo(9.589f, 14.75f, 9.249f, 14.41f, 9.249f, 14f)
                curveTo(9.249f, 13.59f, 9.589f, 13.25f, 9.999f, 13.25f)
                horizontalLineTo(13.999f)
                curveTo(14.409f, 13.25f, 14.749f, 13.59f, 14.749f, 14f)
                curveTo(14.749f, 14.41f, 14.409f, 14.75f, 13.999f, 14.75f)
                close()
                moveTo(13.999f, 11.75f)
                horizontalLineTo(9.999f)
                curveTo(9.589f, 11.75f, 9.249f, 11.41f, 9.249f, 11f)
                curveTo(9.249f, 10.59f, 9.589f, 10.25f, 9.999f, 10.25f)
                horizontalLineTo(13.999f)
                curveTo(14.409f, 10.25f, 14.749f, 10.59f, 14.749f, 11f)
                curveTo(14.749f, 11.41f, 14.409f, 11.75f, 13.999f, 11.75f)
                close()
            }
        }.build()

        return _Buildings2!!
    }

@Suppress("ObjectPropertyName")
private var _Buildings2: ImageVector? = null
