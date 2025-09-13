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


val Iconsax.Filled.Setting3: ImageVector
    get() {
        if (_Setting3 != null) {
            return _Setting3!!
        }
        _Setting3 = ImageVector.Builder(
            name = "Filled.Setting3",
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
                moveTo(7.67f, 5.5f)
                curveTo(7.67f, 5.09f, 8.01f, 4.75f, 8.42f, 4.75f)
                curveTo(8.83f, 4.75f, 9.17f, 5.09f, 9.17f, 5.5f)
                verticalLineTo(9.4f)
                curveTo(9.17f, 9.81f, 8.83f, 10.15f, 8.42f, 10.15f)
                curveTo(8.01f, 10.15f, 7.67f, 9.81f, 7.67f, 9.4f)
                verticalLineTo(5.5f)
                close()
                moveTo(9.523f, 16.431f)
                curveTo(9.319f, 16.522f, 9.17f, 16.713f, 9.17f, 16.936f)
                verticalLineTo(18.5f)
                curveTo(9.17f, 18.91f, 8.83f, 19.25f, 8.42f, 19.25f)
                curveTo(8.01f, 19.25f, 7.67f, 18.91f, 7.67f, 18.5f)
                verticalLineTo(16.936f)
                curveTo(7.67f, 16.713f, 7.521f, 16.522f, 7.317f, 16.431f)
                curveTo(6.363f, 16.006f, 5.7f, 15.058f, 5.7f, 13.95f)
                curveTo(5.7f, 12.45f, 6.92f, 11.22f, 8.42f, 11.22f)
                curveTo(9.92f, 11.22f, 11.15f, 12.44f, 11.15f, 13.95f)
                curveTo(11.15f, 15.058f, 10.479f, 16.007f, 9.523f, 16.431f)
                close()
                moveTo(16.33f, 18.5f)
                curveTo(16.33f, 18.91f, 15.99f, 19.25f, 15.58f, 19.25f)
                curveTo(15.17f, 19.25f, 14.83f, 18.91f, 14.83f, 18.5f)
                verticalLineTo(14.6f)
                curveTo(14.83f, 14.19f, 15.17f, 13.85f, 15.58f, 13.85f)
                curveTo(15.99f, 13.85f, 16.33f, 14.19f, 16.33f, 14.6f)
                verticalLineTo(18.5f)
                close()
                moveTo(15.58f, 12.77f)
                curveTo(14.08f, 12.77f, 12.85f, 11.55f, 12.85f, 10.04f)
                curveTo(12.85f, 8.932f, 13.521f, 7.983f, 14.477f, 7.559f)
                curveTo(14.681f, 7.468f, 14.83f, 7.277f, 14.83f, 7.054f)
                verticalLineTo(5.5f)
                curveTo(14.83f, 5.09f, 15.17f, 4.75f, 15.58f, 4.75f)
                curveTo(15.99f, 4.75f, 16.33f, 5.09f, 16.33f, 5.5f)
                verticalLineTo(7.064f)
                curveTo(16.33f, 7.287f, 16.479f, 7.478f, 16.683f, 7.569f)
                curveTo(17.637f, 7.994f, 18.3f, 8.942f, 18.3f, 10.05f)
                curveTo(18.3f, 11.55f, 17.08f, 12.77f, 15.58f, 12.77f)
                close()
            }
        }.build()

        return _Setting3!!
    }

@Suppress("ObjectPropertyName")
private var _Setting3: ImageVector? = null
