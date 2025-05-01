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

val Iconsax.Outline.Eye: ImageVector
    get() {
        if (_Eye != null) {
            return _Eye!!
        }
        _Eye = ImageVector.Builder(
            name = "Outline.Eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.33f)
                curveTo(9.61f, 16.33f, 7.67f, 14.39f, 7.67f, 12f)
                curveTo(7.67f, 9.61f, 9.61f, 7.67f, 12f, 7.67f)
                curveTo(14.39f, 7.67f, 16.33f, 9.61f, 16.33f, 12f)
                curveTo(16.33f, 14.39f, 14.39f, 16.33f, 12f, 16.33f)
                close()
                moveTo(12f, 9.17f)
                curveTo(10.44f, 9.17f, 9.17f, 10.44f, 9.17f, 12f)
                curveTo(9.17f, 13.56f, 10.44f, 14.83f, 12f, 14.83f)
                curveTo(13.56f, 14.83f, 14.83f, 13.56f, 14.83f, 12f)
                curveTo(14.83f, 10.44f, 13.56f, 9.17f, 12f, 9.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 21.02f)
                curveTo(8.24f, 21.02f, 4.69f, 18.82f, 2.25f, 15f)
                curveTo(1.19f, 13.35f, 1.19f, 10.66f, 2.25f, 9f)
                curveTo(4.7f, 5.18f, 8.25f, 2.98f, 12f, 2.98f)
                curveTo(15.75f, 2.98f, 19.3f, 5.18f, 21.74f, 9f)
                curveTo(22.8f, 10.65f, 22.8f, 13.34f, 21.74f, 15f)
                curveTo(19.3f, 18.82f, 15.75f, 21.02f, 12f, 21.02f)
                close()
                moveTo(12f, 4.48f)
                curveTo(8.77f, 4.48f, 5.68f, 6.42f, 3.52f, 9.81f)
                curveTo(2.77f, 10.98f, 2.77f, 13.02f, 3.52f, 14.19f)
                curveTo(5.68f, 17.58f, 8.77f, 19.52f, 12f, 19.52f)
                curveTo(15.23f, 19.52f, 18.32f, 17.58f, 20.48f, 14.19f)
                curveTo(21.23f, 13.02f, 21.23f, 10.98f, 20.48f, 9.81f)
                curveTo(18.32f, 6.42f, 15.23f, 4.48f, 12f, 4.48f)
                close()
            }
        }.build()

        return _Eye!!
    }

@Suppress("ObjectPropertyName")
private var _Eye: ImageVector? = null
