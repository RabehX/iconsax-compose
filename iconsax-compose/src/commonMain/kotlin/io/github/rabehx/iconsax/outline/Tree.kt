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

val Iconsax.Outline.Tree: ImageVector
    get() {
        if (_Tree != null) {
            return _Tree!!
        }
        _Tree = ImageVector.Builder(
            name = "Outline.Tree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.17f, 10.81f)
                horizontalLineTo(7.83f)
                curveTo(6.97f, 10.81f, 6.31f, 10.47f, 6.01f, 9.89f)
                curveTo(5.71f, 9.3f, 5.83f, 8.57f, 6.33f, 7.88f)
                lineTo(10.5f, 2.04f)
                curveTo(11.24f, 0.98f, 12.77f, 0.98f, 13.52f, 2.05f)
                lineTo(17.69f, 7.88f)
                curveTo(18.19f, 8.57f, 18.31f, 9.3f, 18.01f, 9.89f)
                curveTo(17.69f, 10.47f, 17.03f, 10.81f, 16.17f, 10.81f)
                close()
                moveTo(12f, 2.7f)
                curveTo(11.91f, 2.7f, 11.81f, 2.78f, 11.72f, 2.9f)
                lineTo(7.55f, 8.75f)
                curveTo(7.35f, 9.02f, 7.34f, 9.18f, 7.35f, 9.21f)
                curveTo(7.36f, 9.23f, 7.5f, 9.31f, 7.84f, 9.31f)
                horizontalLineTo(16.18f)
                curveTo(16.51f, 9.31f, 16.65f, 9.22f, 16.67f, 9.2f)
                curveTo(16.67f, 9.18f, 16.66f, 9.02f, 16.47f, 8.75f)
                lineTo(12.3f, 2.91f)
                curveTo(12.19f, 2.77f, 12.09f, 2.7f, 12f, 2.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.59f, 18.75f)
                horizontalLineTo(6.42f)
                curveTo(4.99f, 18.75f, 4.42f, 18.06f, 4.21f, 17.65f)
                curveTo(4f, 17.24f, 3.78f, 16.38f, 4.62f, 15.22f)
                lineTo(8.61f, 9.62f)
                curveTo(8.75f, 9.42f, 8.98f, 9.31f, 9.22f, 9.31f)
                horizontalLineTo(14.79f)
                curveTo(15.03f, 9.31f, 15.26f, 9.43f, 15.4f, 9.62f)
                lineTo(19.39f, 15.23f)
                curveTo(20.23f, 16.38f, 20f, 17.24f, 19.79f, 17.65f)
                curveTo(19.58f, 18.06f, 19.02f, 18.75f, 17.59f, 18.75f)
                close()
                moveTo(9.6f, 10.81f)
                lineTo(5.83f, 16.1f)
                curveTo(5.51f, 16.54f, 5.48f, 16.84f, 5.54f, 16.97f)
                curveTo(5.61f, 17.1f, 5.87f, 17.25f, 6.41f, 17.25f)
                horizontalLineTo(17.58f)
                curveTo(18.12f, 17.25f, 18.39f, 17.1f, 18.45f, 16.97f)
                curveTo(18.52f, 16.84f, 18.48f, 16.54f, 18.16f, 16.1f)
                lineTo(14.39f, 10.8f)
                horizontalLineTo(9.6f)
                verticalLineTo(10.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(18f)
                curveTo(11.25f, 17.59f, 11.59f, 17.25f, 12f, 17.25f)
                curveTo(12.41f, 17.25f, 12.75f, 17.59f, 12.75f, 18f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
        }.build()

        return _Tree!!
    }

@Suppress("ObjectPropertyName")
private var _Tree: ImageVector? = null
