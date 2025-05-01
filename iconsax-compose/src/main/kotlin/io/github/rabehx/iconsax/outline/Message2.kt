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

val Iconsax.Outline.Message2: ImageVector
    get() {
        if (_Message2 != null) {
            return _Message2!!
        }
        _Message2 = ImageVector.Builder(
            name = "Outline.Message2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 11.25f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 11.25f, 7.75f, 10.91f, 7.75f, 10.5f)
                curveTo(7.75f, 10.09f, 8.09f, 9.75f, 8.5f, 9.75f)
                horizontalLineTo(15.5f)
                curveTo(15.91f, 9.75f, 16.25f, 10.09f, 16.25f, 10.5f)
                curveTo(16.25f, 10.91f, 15.91f, 11.25f, 15.5f, 11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.32f)
                curveTo(15.66f, 22.32f, 15.32f, 22.22f, 15.03f, 22.03f)
                lineTo(10.77f, 19.19f)
                horizontalLineTo(7f)
                curveTo(3.56f, 19.19f, 1.25f, 16.88f, 1.25f, 13.44f)
                verticalLineTo(7.44f)
                curveTo(1.25f, 4f, 3.56f, 1.69f, 7f, 1.69f)
                horizontalLineTo(17f)
                curveTo(20.44f, 1.69f, 22.75f, 4f, 22.75f, 7.44f)
                verticalLineTo(13.44f)
                curveTo(22.75f, 16.62f, 20.77f, 18.84f, 17.75f, 19.15f)
                verticalLineTo(20.57f)
                curveTo(17.75f, 21.22f, 17.4f, 21.81f, 16.83f, 22.11f)
                curveTo(16.57f, 22.25f, 16.28f, 22.32f, 16f, 22.32f)
                close()
                moveTo(7f, 3.18f)
                curveTo(4.42f, 3.18f, 2.75f, 4.85f, 2.75f, 7.43f)
                verticalLineTo(13.43f)
                curveTo(2.75f, 16.01f, 4.42f, 17.68f, 7f, 17.68f)
                horizontalLineTo(11f)
                curveTo(11.15f, 17.68f, 11.29f, 17.72f, 11.42f, 17.81f)
                lineTo(15.87f, 20.77f)
                curveTo(15.98f, 20.84f, 16.08f, 20.81f, 16.13f, 20.78f)
                curveTo(16.18f, 20.75f, 16.26f, 20.69f, 16.26f, 20.56f)
                verticalLineTo(18.43f)
                curveTo(16.26f, 18.02f, 16.6f, 17.68f, 17.01f, 17.68f)
                curveTo(19.59f, 17.68f, 21.26f, 16.01f, 21.26f, 13.43f)
                verticalLineTo(7.43f)
                curveTo(21.26f, 4.85f, 19.59f, 3.18f, 17.01f, 3.18f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _Message2!!
    }

@Suppress("ObjectPropertyName")
private var _Message2: ImageVector? = null
