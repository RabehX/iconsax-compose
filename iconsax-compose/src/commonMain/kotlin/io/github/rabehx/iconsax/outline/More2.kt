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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.More2: ImageVector
    get() {
        if (_More2 != null) {
            return _More2!!
        }
        _More2 = ImageVector.Builder(
            name = "Outline.More2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 10.07f)
                curveTo(10.4f, 10.07f, 9.09f, 8.76f, 9.09f, 7.16f)
                curveTo(9.09f, 5.56f, 10.4f, 4.25f, 12f, 4.25f)
                curveTo(13.6f, 4.25f, 14.91f, 5.56f, 14.91f, 7.16f)
                curveTo(14.91f, 8.76f, 13.6f, 10.07f, 12f, 10.07f)
                close()
                moveTo(12f, 5.75f)
                curveTo(11.22f, 5.75f, 10.59f, 6.38f, 10.59f, 7.16f)
                curveTo(10.59f, 7.94f, 11.22f, 8.57f, 12f, 8.57f)
                curveTo(12.78f, 8.57f, 13.41f, 7.94f, 13.41f, 7.16f)
                curveTo(13.41f, 6.38f, 12.78f, 5.75f, 12f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.79f, 19.75f)
                curveTo(5.19f, 19.75f, 3.88f, 18.44f, 3.88f, 16.84f)
                curveTo(3.88f, 15.24f, 5.19f, 13.93f, 6.79f, 13.93f)
                curveTo(8.39f, 13.93f, 9.7f, 15.24f, 9.7f, 16.84f)
                curveTo(9.7f, 18.44f, 8.39f, 19.75f, 6.79f, 19.75f)
                close()
                moveTo(6.79f, 15.43f)
                curveTo(6.01f, 15.43f, 5.38f, 16.06f, 5.38f, 16.84f)
                curveTo(5.38f, 17.62f, 6.01f, 18.25f, 6.79f, 18.25f)
                curveTo(7.57f, 18.25f, 8.2f, 17.62f, 8.2f, 16.84f)
                curveTo(8.2f, 16.06f, 7.56f, 15.43f, 6.79f, 15.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.21f, 19.75f)
                curveTo(15.61f, 19.75f, 14.3f, 18.44f, 14.3f, 16.84f)
                curveTo(14.3f, 15.24f, 15.61f, 13.93f, 17.21f, 13.93f)
                curveTo(18.81f, 13.93f, 20.12f, 15.24f, 20.12f, 16.84f)
                curveTo(20.12f, 18.44f, 18.82f, 19.75f, 17.21f, 19.75f)
                close()
                moveTo(17.21f, 15.43f)
                curveTo(16.43f, 15.43f, 15.8f, 16.06f, 15.8f, 16.84f)
                curveTo(15.8f, 17.62f, 16.43f, 18.25f, 17.21f, 18.25f)
                curveTo(17.99f, 18.25f, 18.62f, 17.62f, 18.62f, 16.84f)
                curveTo(18.62f, 16.06f, 17.99f, 15.43f, 17.21f, 15.43f)
                close()
            }
        }.build()

        return _More2!!
    }

@Suppress("ObjectPropertyName")
private var _More2: ImageVector? = null
