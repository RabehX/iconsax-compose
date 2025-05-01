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

val Iconsax.Outline.Edit: ImageVector
    get() {
        if (_Edit != null) {
            return _Edit!!
        }
        _Edit = ImageVector.Builder(
            name = "Outline.Edit",
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
                horizontalLineTo(11f)
                curveTo(11.41f, 1.25f, 11.75f, 1.59f, 11.75f, 2f)
                curveTo(11.75f, 2.41f, 11.41f, 2.75f, 11f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(13f)
                curveTo(21.25f, 12.59f, 21.59f, 12.25f, 22f, 12.25f)
                curveTo(22.41f, 12.25f, 22.75f, 12.59f, 22.75f, 13f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.499f, 17.69f)
                curveTo(7.889f, 17.69f, 7.329f, 17.47f, 6.919f, 17.07f)
                curveTo(6.429f, 16.58f, 6.219f, 15.87f, 6.329f, 15.12f)
                lineTo(6.759f, 12.11f)
                curveTo(6.839f, 11.53f, 7.219f, 10.78f, 7.629f, 10.37f)
                lineTo(15.509f, 2.49f)
                curveTo(17.499f, 0.5f, 19.519f, 0.5f, 21.509f, 2.49f)
                curveTo(22.599f, 3.58f, 23.089f, 4.69f, 22.989f, 5.8f)
                curveTo(22.899f, 6.7f, 22.419f, 7.58f, 21.509f, 8.48f)
                lineTo(13.629f, 16.36f)
                curveTo(13.219f, 16.77f, 12.469f, 17.15f, 11.889f, 17.23f)
                lineTo(8.879f, 17.66f)
                curveTo(8.749f, 17.69f, 8.619f, 17.69f, 8.499f, 17.69f)
                close()
                moveTo(16.569f, 3.55f)
                lineTo(8.689f, 11.43f)
                curveTo(8.499f, 11.62f, 8.279f, 12.06f, 8.239f, 12.32f)
                lineTo(7.809f, 15.33f)
                curveTo(7.769f, 15.62f, 7.829f, 15.86f, 7.979f, 16.01f)
                curveTo(8.129f, 16.16f, 8.369f, 16.22f, 8.659f, 16.18f)
                lineTo(11.669f, 15.75f)
                curveTo(11.929f, 15.71f, 12.379f, 15.49f, 12.559f, 15.3f)
                lineTo(20.439f, 7.42f)
                curveTo(21.089f, 6.77f, 21.429f, 6.19f, 21.479f, 5.65f)
                curveTo(21.539f, 5f, 21.199f, 4.31f, 20.439f, 3.54f)
                curveTo(18.839f, 1.94f, 17.739f, 2.39f, 16.569f, 3.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.85f, 9.83f)
                curveTo(19.78f, 9.83f, 19.71f, 9.82f, 19.65f, 9.8f)
                curveTo(17.02f, 9.06f, 14.93f, 6.97f, 14.19f, 4.34f)
                curveTo(14.08f, 3.94f, 14.31f, 3.53f, 14.71f, 3.41f)
                curveTo(15.11f, 3.3f, 15.52f, 3.53f, 15.63f, 3.93f)
                curveTo(16.23f, 6.06f, 17.92f, 7.75f, 20.05f, 8.35f)
                curveTo(20.45f, 8.46f, 20.68f, 8.88f, 20.57f, 9.28f)
                curveTo(20.48f, 9.62f, 20.18f, 9.83f, 19.85f, 9.83f)
                close()
            }
        }.build()

        return _Edit!!
    }

@Suppress("ObjectPropertyName")
private var _Edit: ImageVector? = null
