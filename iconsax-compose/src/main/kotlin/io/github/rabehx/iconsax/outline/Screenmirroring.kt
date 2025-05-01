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

val Iconsax.Outline.Screenmirroring: ImageVector
    get() {
        if (_Screenmirroring != null) {
            return _Screenmirroring!!
        }
        _Screenmirroring = ImageVector.Builder(
            name = "Outline.Screenmirroring",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.4f, 19.25f)
                horizontalLineTo(12.6f)
                curveTo(10.68f, 19.25f, 9.75f, 18.32f, 9.75f, 16.4f)
                verticalLineTo(14.6f)
                curveTo(9.75f, 12.68f, 10.68f, 11.75f, 12.6f, 11.75f)
                horizontalLineTo(16.4f)
                curveTo(18.32f, 11.75f, 19.25f, 12.68f, 19.25f, 14.6f)
                verticalLineTo(16.4f)
                curveTo(19.25f, 18.32f, 18.32f, 19.25f, 16.4f, 19.25f)
                close()
                moveTo(12.6f, 13.25f)
                curveTo(11.52f, 13.25f, 11.25f, 13.52f, 11.25f, 14.6f)
                verticalLineTo(16.4f)
                curveTo(11.25f, 17.48f, 11.52f, 17.75f, 12.6f, 17.75f)
                horizontalLineTo(16.4f)
                curveTo(17.48f, 17.75f, 17.75f, 17.48f, 17.75f, 16.4f)
                verticalLineTo(14.6f)
                curveTo(17.75f, 13.52f, 17.48f, 13.25f, 16.4f, 13.25f)
                horizontalLineTo(12.6f)
                close()
            }
        }.build()

        return _Screenmirroring!!
    }

@Suppress("ObjectPropertyName")
private var _Screenmirroring: ImageVector? = null
