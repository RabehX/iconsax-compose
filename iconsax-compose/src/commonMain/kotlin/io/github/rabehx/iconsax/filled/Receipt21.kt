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


val Iconsax.Filled.Receipt21: ImageVector
    get() {
        if (_Receipt21 != null) {
            return _Receipt21!!
        }
        _Receipt21 = ImageVector.Builder(
            name = "Filled.Receipt21",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.78f, 2f)
                horizontalLineTo(8.22f)
                curveTo(4.44f, 2f, 3.5f, 3.01f, 3.5f, 7.04f)
                verticalLineTo(18.3f)
                curveTo(3.5f, 20.96f, 4.96f, 21.59f, 6.73f, 19.69f)
                lineTo(6.74f, 19.68f)
                curveTo(7.56f, 18.81f, 8.81f, 18.88f, 9.52f, 19.83f)
                lineTo(10.53f, 21.18f)
                curveTo(11.34f, 22.25f, 12.65f, 22.25f, 13.46f, 21.18f)
                lineTo(14.47f, 19.83f)
                curveTo(15.19f, 18.87f, 16.44f, 18.8f, 17.26f, 19.68f)
                curveTo(19.04f, 21.58f, 20.49f, 20.95f, 20.49f, 18.29f)
                verticalLineTo(7.04f)
                curveTo(20.5f, 3.01f, 19.56f, 2f, 15.78f, 2f)
                close()
                moveTo(7.78f, 12f)
                curveTo(7.23f, 12f, 6.78f, 11.55f, 6.78f, 11f)
                curveTo(6.78f, 10.45f, 7.23f, 10f, 7.78f, 10f)
                curveTo(8.33f, 10f, 8.78f, 10.45f, 8.78f, 11f)
                curveTo(8.78f, 11.55f, 8.33f, 12f, 7.78f, 12f)
                close()
                moveTo(7.78f, 8f)
                curveTo(7.23f, 8f, 6.78f, 7.55f, 6.78f, 7f)
                curveTo(6.78f, 6.45f, 7.23f, 6f, 7.78f, 6f)
                curveTo(8.33f, 6f, 8.78f, 6.45f, 8.78f, 7f)
                curveTo(8.78f, 7.55f, 8.33f, 8f, 7.78f, 8f)
                close()
                moveTo(16.23f, 11.75f)
                horizontalLineTo(10.73f)
                curveTo(10.32f, 11.75f, 9.98f, 11.41f, 9.98f, 11f)
                curveTo(9.98f, 10.59f, 10.32f, 10.25f, 10.73f, 10.25f)
                horizontalLineTo(16.23f)
                curveTo(16.64f, 10.25f, 16.98f, 10.59f, 16.98f, 11f)
                curveTo(16.98f, 11.41f, 16.64f, 11.75f, 16.23f, 11.75f)
                close()
                moveTo(16.23f, 7.75f)
                horizontalLineTo(10.73f)
                curveTo(10.32f, 7.75f, 9.98f, 7.41f, 9.98f, 7f)
                curveTo(9.98f, 6.59f, 10.32f, 6.25f, 10.73f, 6.25f)
                horizontalLineTo(16.23f)
                curveTo(16.64f, 6.25f, 16.98f, 6.59f, 16.98f, 7f)
                curveTo(16.98f, 7.41f, 16.64f, 7.75f, 16.23f, 7.75f)
                close()
            }
        }.build()

        return _Receipt21!!
    }

@Suppress("ObjectPropertyName")
private var _Receipt21: ImageVector? = null
