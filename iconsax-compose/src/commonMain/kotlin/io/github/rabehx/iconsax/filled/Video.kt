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


val Iconsax.Filled.Video: ImageVector
    get() {
        if (_Video != null) {
            return _Video!!
        }
        _Video = ImageVector.Builder(
            name = "Filled.Video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.15f, 6.17f)
                curveTo(20.74f, 5.95f, 19.88f, 5.72f, 18.71f, 6.54f)
                lineTo(17.24f, 7.58f)
                curveTo(17.13f, 4.47f, 15.78f, 3.25f, 12.5f, 3.25f)
                horizontalLineTo(6.5f)
                curveTo(3.08f, 3.25f, 1.75f, 4.58f, 1.75f, 8f)
                verticalLineTo(16f)
                curveTo(1.75f, 18.3f, 3f, 20.75f, 6.5f, 20.75f)
                horizontalLineTo(12.5f)
                curveTo(15.78f, 20.75f, 17.13f, 19.53f, 17.24f, 16.42f)
                lineTo(18.71f, 17.46f)
                curveTo(19.33f, 17.9f, 19.87f, 18.04f, 20.3f, 18.04f)
                curveTo(20.67f, 18.04f, 20.96f, 17.93f, 21.15f, 17.83f)
                curveTo(21.56f, 17.62f, 22.25f, 17.05f, 22.25f, 15.62f)
                verticalLineTo(8.38f)
                curveTo(22.25f, 6.95f, 21.56f, 6.38f, 21.15f, 6.17f)
                close()
                moveTo(11f, 11.38f)
                curveTo(9.97f, 11.38f, 9.12f, 10.54f, 9.12f, 9.5f)
                curveTo(9.12f, 8.46f, 9.97f, 7.62f, 11f, 7.62f)
                curveTo(12.03f, 7.62f, 12.88f, 8.46f, 12.88f, 9.5f)
                curveTo(12.88f, 10.54f, 12.03f, 11.38f, 11f, 11.38f)
                close()
            }
        }.build()

        return _Video!!
    }

@Suppress("ObjectPropertyName")
private var _Video: ImageVector? = null
