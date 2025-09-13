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


val Iconsax.Filled.CopySuccess: ImageVector
    get() {
        if (_CopySuccess != null) {
            return _CopySuccess!!
        }
        _CopySuccess = ImageVector.Builder(
            name = "Filled.CopySuccess",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.1f, 2f)
                horizontalLineTo(12.9f)
                curveTo(9.817f, 2f, 8.371f, 3.094f, 8.07f, 5.739f)
                curveTo(8.006f, 6.292f, 8.465f, 6.75f, 9.022f, 6.75f)
                horizontalLineTo(11.1f)
                curveTo(15.3f, 6.75f, 17.25f, 8.7f, 17.25f, 12.9f)
                verticalLineTo(14.978f)
                curveTo(17.25f, 15.535f, 17.707f, 15.993f, 18.261f, 15.93f)
                curveTo(20.906f, 15.629f, 22f, 14.183f, 22f, 11.1f)
                verticalLineTo(6.9f)
                curveTo(22f, 3.4f, 20.6f, 2f, 17.1f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.1f, 8f)
                horizontalLineTo(6.9f)
                curveTo(3.4f, 8f, 2f, 9.4f, 2f, 12.9f)
                verticalLineTo(17.1f)
                curveTo(2f, 20.6f, 3.4f, 22f, 6.9f, 22f)
                horizontalLineTo(11.1f)
                curveTo(14.6f, 22f, 16f, 20.6f, 16f, 17.1f)
                verticalLineTo(12.9f)
                curveTo(16f, 9.4f, 14.6f, 8f, 11.1f, 8f)
                close()
                moveTo(12.29f, 13.65f)
                lineTo(8.58f, 17.36f)
                curveTo(8.44f, 17.5f, 8.26f, 17.57f, 8.07f, 17.57f)
                curveTo(7.88f, 17.57f, 7.7f, 17.5f, 7.56f, 17.36f)
                lineTo(5.7f, 15.5f)
                curveTo(5.42f, 15.22f, 5.42f, 14.77f, 5.7f, 14.49f)
                curveTo(5.98f, 14.21f, 6.43f, 14.21f, 6.71f, 14.49f)
                lineTo(8.06f, 15.84f)
                lineTo(11.27f, 12.63f)
                curveTo(11.55f, 12.35f, 12f, 12.35f, 12.28f, 12.63f)
                curveTo(12.56f, 12.91f, 12.57f, 13.37f, 12.29f, 13.65f)
                close()
            }
        }.build()

        return _CopySuccess!!
    }

@Suppress("ObjectPropertyName")
private var _CopySuccess: ImageVector? = null
