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


val Iconsax.Filled.CloudChange: ImageVector
    get() {
        if (_CloudChange != null) {
            return _CloudChange!!
        }
        _CloudChange = ImageVector.Builder(
            name = "Filled.CloudChange",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.109f, 11.85f)
                curveTo(5.289f, 12.05f, 5.299f, 16.15f, 8.109f, 16.35f)
                horizontalLineTo(14.779f)
                curveTo(15.589f, 16.36f, 16.369f, 16.05f, 16.969f, 15.51f)
                curveTo(18.949f, 13.78f, 17.889f, 10.31f, 15.289f, 9.98f)
                curveTo(14.359f, 4.34f, 6.209f, 6.48f, 8.139f, 11.85f)
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 22.75f)
                curveTo(4.73f, 22.75f, 1.25f, 19.27f, 1.25f, 15f)
                curveTo(1.25f, 14.59f, 1.59f, 14.25f, 2f, 14.25f)
                curveTo(2.41f, 14.25f, 2.75f, 14.59f, 2.75f, 15f)
                curveTo(2.75f, 17.96f, 4.81f, 20.44f, 7.58f, 21.09f)
                lineTo(7.31f, 20.64f)
                curveTo(7.1f, 20.28f, 7.21f, 19.82f, 7.57f, 19.61f)
                curveTo(7.92f, 19.4f, 8.39f, 19.51f, 8.6f, 19.87f)
                lineTo(9.65f, 21.62f)
                curveTo(9.79f, 21.85f, 9.79f, 22.14f, 9.66f, 22.37f)
                curveTo(9.52f, 22.6f, 9.27f, 22.75f, 9f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.75f)
                curveTo(21.59f, 9.75f, 21.25f, 9.41f, 21.25f, 9f)
                curveTo(21.25f, 6.04f, 19.19f, 3.56f, 16.42f, 2.91f)
                lineTo(16.69f, 3.36f)
                curveTo(16.9f, 3.72f, 16.79f, 4.18f, 16.43f, 4.39f)
                curveTo(16.08f, 4.6f, 15.61f, 4.49f, 15.4f, 4.13f)
                lineTo(14.35f, 2.38f)
                curveTo(14.21f, 2.15f, 14.21f, 1.86f, 14.34f, 1.63f)
                curveTo(14.48f, 1.4f, 14.73f, 1.25f, 15f, 1.25f)
                curveTo(19.27f, 1.25f, 22.75f, 4.73f, 22.75f, 9f)
                curveTo(22.75f, 9.41f, 22.41f, 9.75f, 22f, 9.75f)
                close()
            }
        }.build()

        return _CloudChange!!
    }

@Suppress("ObjectPropertyName")
private var _CloudChange: ImageVector? = null
