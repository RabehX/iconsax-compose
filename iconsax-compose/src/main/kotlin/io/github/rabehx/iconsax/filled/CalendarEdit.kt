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


val Iconsax.Filled.CalendarEdit: ImageVector
    get() {
        if (_CalendarEdit != null) {
            return _CalendarEdit!!
        }
        _CalendarEdit = ImageVector.Builder(
            name = "Filled.CalendarEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.75f, 3.56f)
                verticalLineTo(2f)
                curveTo(16.75f, 1.59f, 16.41f, 1.25f, 16f, 1.25f)
                curveTo(15.59f, 1.25f, 15.25f, 1.59f, 15.25f, 2f)
                verticalLineTo(3.5f)
                horizontalLineTo(8.75f)
                verticalLineTo(2f)
                curveTo(8.75f, 1.59f, 8.41f, 1.25f, 8f, 1.25f)
                curveTo(7.59f, 1.25f, 7.25f, 1.59f, 7.25f, 2f)
                verticalLineTo(3.56f)
                curveTo(4.55f, 3.81f, 3.24f, 5.42f, 3.04f, 7.81f)
                curveTo(3.02f, 8.1f, 3.26f, 8.34f, 3.54f, 8.34f)
                horizontalLineTo(20.46f)
                curveTo(20.75f, 8.34f, 20.99f, 8.09f, 20.96f, 7.81f)
                curveTo(20.76f, 5.42f, 19.45f, 3.81f, 16.75f, 3.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 9.84f)
                horizontalLineTo(4f)
                curveTo(3.45f, 9.84f, 3f, 10.29f, 3f, 10.84f)
                verticalLineTo(17f)
                curveTo(3f, 20f, 4.5f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(19.5f, 22f, 21f, 20f, 21f, 17f)
                verticalLineTo(10.84f)
                curveTo(21f, 10.29f, 20.55f, 9.84f, 20f, 9.84f)
                close()
                moveTo(14.84f, 14.99f)
                lineTo(14.34f, 15.5f)
                horizontalLineTo(14.33f)
                lineTo(11.3f, 18.53f)
                curveTo(11.17f, 18.66f, 10.9f, 18.8f, 10.71f, 18.82f)
                lineTo(9.36f, 19.02f)
                curveTo(8.87f, 19.09f, 8.53f, 18.74f, 8.6f, 18.26f)
                lineTo(8.79f, 16.9f)
                curveTo(8.82f, 16.71f, 8.95f, 16.45f, 9.08f, 16.31f)
                lineTo(12.12f, 13.28f)
                lineTo(12.62f, 12.77f)
                curveTo(12.95f, 12.44f, 13.32f, 12.2f, 13.72f, 12.2f)
                curveTo(14.06f, 12.2f, 14.43f, 12.36f, 14.84f, 12.77f)
                curveTo(15.74f, 13.67f, 15.45f, 14.38f, 14.84f, 14.99f)
                close()
            }
        }.build()

        return _CalendarEdit!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarEdit: ImageVector? = null
