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

val Iconsax.Outline.Menu: ImageVector
    get() {
        if (_Menu != null) {
            return _Menu!!
        }
        _Menu = ImageVector.Builder(
            name = "Outline.Menu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.54f, 9.06f)
                curveTo(15.77f, 9.06f, 14.33f, 7.62f, 14.33f, 5.85f)
                curveTo(14.33f, 4.08f, 15.77f, 2.64f, 17.54f, 2.64f)
                curveTo(19.31f, 2.64f, 20.75f, 4.08f, 20.75f, 5.85f)
                curveTo(20.75f, 7.62f, 19.31f, 9.06f, 17.54f, 9.06f)
                close()
                moveTo(17.54f, 4.13f)
                curveTo(16.6f, 4.13f, 15.83f, 4.9f, 15.83f, 5.84f)
                curveTo(15.83f, 6.78f, 16.6f, 7.55f, 17.54f, 7.55f)
                curveTo(18.48f, 7.55f, 19.25f, 6.78f, 19.25f, 5.84f)
                curveTo(19.25f, 4.9f, 18.48f, 4.13f, 17.54f, 4.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.46f, 9.06f)
                curveTo(4.69f, 9.06f, 3.25f, 7.62f, 3.25f, 5.85f)
                curveTo(3.25f, 4.08f, 4.69f, 2.64f, 6.46f, 2.64f)
                curveTo(8.23f, 2.64f, 9.67f, 4.08f, 9.67f, 5.85f)
                curveTo(9.67f, 7.62f, 8.23f, 9.06f, 6.46f, 9.06f)
                close()
                moveTo(6.46f, 4.13f)
                curveTo(5.52f, 4.13f, 4.75f, 4.9f, 4.75f, 5.84f)
                curveTo(4.75f, 6.78f, 5.52f, 7.55f, 6.46f, 7.55f)
                curveTo(7.4f, 7.55f, 8.17f, 6.78f, 8.17f, 5.84f)
                curveTo(8.17f, 4.9f, 7.41f, 4.13f, 6.46f, 4.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.54f, 21.37f)
                curveTo(15.77f, 21.37f, 14.33f, 19.93f, 14.33f, 18.16f)
                curveTo(14.33f, 16.39f, 15.77f, 14.95f, 17.54f, 14.95f)
                curveTo(19.31f, 14.95f, 20.75f, 16.39f, 20.75f, 18.16f)
                curveTo(20.75f, 19.93f, 19.31f, 21.37f, 17.54f, 21.37f)
                close()
                moveTo(17.54f, 16.44f)
                curveTo(16.6f, 16.44f, 15.83f, 17.21f, 15.83f, 18.15f)
                curveTo(15.83f, 19.09f, 16.6f, 19.86f, 17.54f, 19.86f)
                curveTo(18.48f, 19.86f, 19.25f, 19.09f, 19.25f, 18.15f)
                curveTo(19.25f, 17.21f, 18.48f, 16.44f, 17.54f, 16.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.46f, 21.37f)
                curveTo(4.69f, 21.37f, 3.25f, 19.93f, 3.25f, 18.16f)
                curveTo(3.25f, 16.39f, 4.69f, 14.95f, 6.46f, 14.95f)
                curveTo(8.23f, 14.95f, 9.67f, 16.39f, 9.67f, 18.16f)
                curveTo(9.67f, 19.93f, 8.23f, 21.37f, 6.46f, 21.37f)
                close()
                moveTo(6.46f, 16.44f)
                curveTo(5.52f, 16.44f, 4.75f, 17.21f, 4.75f, 18.15f)
                curveTo(4.75f, 19.09f, 5.52f, 19.86f, 6.46f, 19.86f)
                curveTo(7.4f, 19.86f, 8.17f, 19.09f, 8.17f, 18.15f)
                curveTo(8.17f, 17.21f, 7.41f, 16.44f, 6.46f, 16.44f)
                close()
            }
        }.build()

        return _Menu!!
    }

@Suppress("ObjectPropertyName")
private var _Menu: ImageVector? = null
