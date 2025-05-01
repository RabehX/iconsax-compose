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


val Iconsax.Filled.Lock: ImageVector
    get() {
        if (_Lock != null) {
            return _Lock!!
        }
        _Lock = ImageVector.Builder(
            name = "Filled.Lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 17.35f)
                curveTo(12.901f, 17.35f, 13.631f, 16.62f, 13.631f, 15.72f)
                curveTo(13.631f, 14.82f, 12.901f, 14.09f, 12.001f, 14.09f)
                curveTo(11.101f, 14.09f, 10.371f, 14.82f, 10.371f, 15.72f)
                curveTo(10.371f, 16.62f, 11.101f, 17.35f, 12.001f, 17.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.28f, 9.53f)
                verticalLineTo(8.28f)
                curveTo(18.28f, 5.58f, 17.63f, 2f, 12f, 2f)
                curveTo(6.37f, 2f, 5.72f, 5.58f, 5.72f, 8.28f)
                verticalLineTo(9.53f)
                curveTo(2.92f, 9.88f, 2f, 11.3f, 2f, 14.79f)
                verticalLineTo(16.65f)
                curveTo(2f, 20.75f, 3.25f, 22f, 7.35f, 22f)
                horizontalLineTo(16.65f)
                curveTo(20.75f, 22f, 22f, 20.75f, 22f, 16.65f)
                verticalLineTo(14.79f)
                curveTo(22f, 11.3f, 21.08f, 9.88f, 18.28f, 9.53f)
                close()
                moveTo(12f, 18.74f)
                curveTo(10.33f, 18.74f, 8.98f, 17.38f, 8.98f, 15.72f)
                curveTo(8.98f, 14.05f, 10.34f, 12.7f, 12f, 12.7f)
                curveTo(13.66f, 12.7f, 15.02f, 14.06f, 15.02f, 15.72f)
                curveTo(15.02f, 17.39f, 13.67f, 18.74f, 12f, 18.74f)
                close()
                moveTo(7.35f, 9.44f)
                curveTo(7.27f, 9.44f, 7.2f, 9.44f, 7.12f, 9.44f)
                verticalLineTo(8.28f)
                curveTo(7.12f, 5.35f, 7.95f, 3.4f, 12f, 3.4f)
                curveTo(16.05f, 3.4f, 16.88f, 5.35f, 16.88f, 8.28f)
                verticalLineTo(9.45f)
                curveTo(16.8f, 9.45f, 16.73f, 9.45f, 16.65f, 9.45f)
                horizontalLineTo(7.35f)
                verticalLineTo(9.44f)
                close()
            }
        }.build()

        return _Lock!!
    }

@Suppress("ObjectPropertyName")
private var _Lock: ImageVector? = null
