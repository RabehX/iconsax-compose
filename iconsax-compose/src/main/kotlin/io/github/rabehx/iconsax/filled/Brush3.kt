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


val Iconsax.Filled.Brush3: ImageVector
    get() {
        if (_Brush3 != null) {
            return _Brush3!!
        }
        _Brush3 = ImageVector.Builder(
            name = "Filled.Brush3",
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
                moveTo(10.49f, 16.72f)
                curveTo(10.15f, 17.06f, 9.7f, 17.29f, 9.15f, 17.36f)
                lineTo(7.8f, 17.51f)
                curveTo(7.06f, 17.59f, 6.43f, 16.96f, 6.51f, 16.21f)
                lineTo(6.66f, 14.85f)
                curveTo(6.79f, 13.64f, 7.8f, 12.87f, 8.87f, 12.85f)
                curveTo(8.97f, 12.84f, 9.09f, 12.85f, 9.2f, 12.86f)
                curveTo(9.67f, 12.92f, 10.12f, 13.14f, 10.5f, 13.51f)
                curveTo(10.87f, 13.88f, 11.08f, 14.32f, 11.14f, 14.77f)
                curveTo(11.15f, 14.88f, 11.16f, 14.99f, 11.16f, 15.09f)
                curveTo(11.16f, 15.71f, 10.93f, 16.28f, 10.49f, 16.72f)
                close()
                moveTo(17.44f, 7.55f)
                curveTo(16.72f, 9.35f, 15.07f, 11.71f, 13.5f, 13.25f)
                curveTo(13.27f, 11.83f, 12.14f, 10.71f, 10.7f, 10.51f)
                curveTo(12.24f, 8.93f, 14.62f, 7.26f, 16.43f, 6.53f)
                curveTo(16.75f, 6.41f, 17.07f, 6.5f, 17.27f, 6.7f)
                curveTo(17.47f, 6.92f, 17.57f, 7.23f, 17.44f, 7.55f)
                close()
            }
        }.build()

        return _Brush3!!
    }

@Suppress("ObjectPropertyName")
private var _Brush3: ImageVector? = null
