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


val Iconsax.Filled.Pet: ImageVector
    get() {
        if (_Pet != null) {
            return _Pet!!
        }
        _Pet = ImageVector.Builder(
            name = "Filled.Pet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.08f, 15.72f)
                curveTo(18.49f, 12.19f, 15.1f, 9.32f, 11.52f, 9.32f)
                curveTo(7.63f, 9.32f, 4.21f, 12.47f, 3.88f, 16.35f)
                curveTo(3.75f, 17.85f, 4.23f, 19.27f, 5.22f, 20.34f)
                curveTo(6.2f, 21.41f, 7.58f, 22f, 9.08f, 22f)
                horizontalLineTo(13.76f)
                curveTo(15.45f, 22f, 16.93f, 21.34f, 17.94f, 20.15f)
                curveTo(18.95f, 18.96f, 19.35f, 17.38f, 19.08f, 15.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.28f, 7.86f)
                curveTo(11.898f, 7.86f, 13.21f, 6.548f, 13.21f, 4.93f)
                curveTo(13.21f, 3.312f, 11.898f, 2f, 10.28f, 2f)
                curveTo(8.661f, 2f, 7.35f, 3.312f, 7.35f, 4.93f)
                curveTo(7.35f, 6.548f, 8.661f, 7.86f, 10.28f, 7.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.94f, 9.028f)
                curveTo(18.288f, 9.028f, 19.38f, 7.936f, 19.38f, 6.588f)
                curveTo(19.38f, 5.241f, 18.288f, 4.148f, 16.94f, 4.148f)
                curveTo(15.592f, 4.148f, 14.5f, 5.241f, 14.5f, 6.588f)
                curveTo(14.5f, 7.936f, 15.592f, 9.028f, 16.94f, 9.028f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.55f, 12.931f)
                curveTo(21.627f, 12.931f, 22.5f, 12.058f, 22.5f, 10.981f)
                curveTo(22.5f, 9.904f, 21.627f, 9.031f, 20.55f, 9.031f)
                curveTo(19.473f, 9.031f, 18.6f, 9.904f, 18.6f, 10.981f)
                curveTo(18.6f, 12.058f, 19.473f, 12.931f, 20.55f, 12.931f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.94f, 10.982f)
                curveTo(5.288f, 10.982f, 6.38f, 9.889f, 6.38f, 8.542f)
                curveTo(6.38f, 7.194f, 5.288f, 6.102f, 3.94f, 6.102f)
                curveTo(2.592f, 6.102f, 1.5f, 7.194f, 1.5f, 8.542f)
                curveTo(1.5f, 9.889f, 2.592f, 10.982f, 3.94f, 10.982f)
                close()
            }
        }.build()

        return _Pet!!
    }

@Suppress("ObjectPropertyName")
private var _Pet: ImageVector? = null
