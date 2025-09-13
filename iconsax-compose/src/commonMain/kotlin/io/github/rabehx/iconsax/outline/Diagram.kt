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

val Iconsax.Outline.Diagram: ImageVector
    get() {
        if (_Diagram != null) {
            return _Diagram!!
        }
        _Diagram = ImageVector.Builder(
            name = "Outline.Diagram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22.75f)
                horizontalLineTo(5f)
                curveTo(2.93f, 22.75f, 1.25f, 21.07f, 1.25f, 19f)
                verticalLineTo(2f)
                curveTo(1.25f, 1.59f, 1.59f, 1.25f, 2f, 1.25f)
                curveTo(2.41f, 1.25f, 2.75f, 1.59f, 2.75f, 2f)
                verticalLineTo(19f)
                curveTo(2.75f, 20.24f, 3.76f, 21.25f, 5f, 21.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 21.25f, 22.75f, 21.59f, 22.75f, 22f)
                curveTo(22.75f, 22.41f, 22.41f, 22.75f, 22f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 17.75f)
                curveTo(4.83f, 17.75f, 4.65f, 17.69f, 4.51f, 17.57f)
                curveTo(4.2f, 17.3f, 4.16f, 16.83f, 4.43f, 16.51f)
                lineTo(9.02f, 11.15f)
                curveTo(9.52f, 10.57f, 10.24f, 10.22f, 11f, 10.19f)
                curveTo(11.76f, 10.17f, 12.51f, 10.45f, 13.05f, 10.99f)
                lineTo(14f, 11.94f)
                curveTo(14.25f, 12.19f, 14.58f, 12.31f, 14.93f, 12.31f)
                curveTo(15.28f, 12.3f, 15.6f, 12.14f, 15.83f, 11.87f)
                lineTo(20.42f, 6.51f)
                curveTo(20.69f, 6.2f, 21.16f, 6.16f, 21.48f, 6.43f)
                curveTo(21.79f, 6.7f, 21.83f, 7.17f, 21.56f, 7.49f)
                lineTo(16.97f, 12.85f)
                curveTo(16.47f, 13.43f, 15.75f, 13.78f, 14.99f, 13.81f)
                curveTo(14.23f, 13.83f, 13.48f, 13.55f, 12.94f, 13.01f)
                lineTo(12f, 12.06f)
                curveTo(11.75f, 11.81f, 11.42f, 11.68f, 11.07f, 11.69f)
                curveTo(10.72f, 11.7f, 10.4f, 11.86f, 10.17f, 12.13f)
                lineTo(5.58f, 17.49f)
                curveTo(5.42f, 17.66f, 5.21f, 17.75f, 5f, 17.75f)
                close()
            }
        }.build()

        return _Diagram!!
    }

@Suppress("ObjectPropertyName")
private var _Diagram: ImageVector? = null
